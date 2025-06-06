class Solution {
    public String truncateSentence(String s, int k) {
        String ans[]=s.split(" ");
        StringBuilder str=new StringBuilder();
        for(int i=0;i<k;i++){
            str.append(ans[i]+" ");
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
}