class Solution {
    //Optimal Approach
    public int maxDifference(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int odd=Integer.MIN_VALUE,even=Integer.MAX_VALUE;
        for(int i : arr){
            if(i<=0){
                continue;
            }
            if(i%2==0){
                even=(even>i)?i:even;
            }else{
                odd=(odd<i)?i:odd;
            }
        }
        return odd-even;
    }
}