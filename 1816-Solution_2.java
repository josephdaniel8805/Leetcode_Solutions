class Solution {
    public String truncateSentence(String s, int k) {
        int count=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==' '){
                count++;
            }
            if(count==k) break;
            i++;
        }
        return s.substring(0,i);
    }
}