class Solution {
    public int maxFreqSum(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        String str = "aeiuo";
        int vow=Integer.MIN_VALUE,con=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            //if(str.indexOf((char)(i+'a'))!= -1){
            if(isVowel((char)(i+'a'))){
                vow=(vow>arr[i])?vow:arr[i];
            }else{
                con=(con>arr[i])?con:arr[i];
            }
        }
        return con+vow;
    }
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}