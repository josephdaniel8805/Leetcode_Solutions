class Solution {
    public int vowelConsonantScore(String s) {
        int v=0,c=0;
        for(int ind=0;ind<s.length();ind++){
            char ch=s.charAt(ind);
            if(ch=='a' || ch=='e' || ch=='u' || ch=='i' || ch=='o'){
                v++;
            }else if(ch<='z' && 'a'<=ch){
                c++;
            }
        }
        if(v==0 || c==0) return 0;
        int ans=(int)Math.floor(v/c);
        return ans;
    }
}