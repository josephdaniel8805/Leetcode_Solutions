class Solution { 
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int ind=k-1;ind>=0;ind--){
            sb.append(s.charAt(ind));
        }
        return sb.append(s.substring(k,s.length())).toString();
    }
}