class Solution {
    public int minOperations(String s) {
        int n=s.length(),count1=0,count2=0;
        char checker='0';
        for(int ind=0;ind<n;ind++){
            char ch=s.charAt(ind);
            if(ch!=checker){
                count1++;   
            }else{
                count2++;
            }
            if(ind%2==0){
                checker='1';
            }else{
                checker='0';
            }
        }
        return Math.min(count1,count2);
    }
}