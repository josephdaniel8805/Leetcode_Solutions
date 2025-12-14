class Solution {
    public String reverseWords(String s) {
        String words[]=s.split(" ");
        int n=words.length;
        StringBuilder ans = new StringBuilder();
        int k=CountVowels(words[0]);
        for(int ind=0;ind<n;ind++){
            if(CountVowels(words[ind])==k && ind!=0){
                StringBuilder sb = new StringBuilder(words[ind]);
                ans.append(sb.reverse().toString());
            }else{
                ans.append(words[ind]);
            }
            if(ind!=(n-1)){
                ans.append(" ");
            }
        }
        System.out.println(words[0]);
        return ans.toString();
    }
    private int CountVowels(String s){
        int count=0;
        for(int ind=0;ind<s.length();ind++){
            char ch=s.charAt(ind);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') count++;
        }
        return count;
    }
}