class Solution {
    public boolean isBalanced(String num) {
        int even=0,odd=0;
        for(int ind=0;ind<num.length();ind++){
            if(ind%2==0){
                even+=(num.charAt(ind)-'0');
            }else{
                odd+=(num.charAt(ind)-'0');
            }
        }
        if(odd==even){
            return true;
        }
        return false;
    }
}