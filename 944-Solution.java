class Solution {
    public int minDeletionSize(String[] strs) {
        int ans=0;
        for(int ind=0;ind<strs[0].length();ind++){
            for(int ptr=0;ptr<strs.length-1;ptr++){
                if(strs[ptr].charAt(ind)>strs[ptr+1].charAt(ind)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}