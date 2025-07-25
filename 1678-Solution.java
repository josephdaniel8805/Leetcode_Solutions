class Solution {
    public String interpret(String command) {
        int n=command.length();
        StringBuilder sb=new StringBuilder();
        for(int ind=0;ind<n;ind++){
            char ch=command.charAt(ind);
            if(ch=='(' && command.charAt(ind+1)==')'){
                ind++;
                sb.append('o');
                continue;
            }else if(ch=='(' || ch==')'){
                continue;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}