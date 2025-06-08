import java.util.*;
class Solution {
    private void dfs(int curr,int n,List<Integer> result){
        if(curr>n) return;
        result.add(curr);
        for(int i=0;i<=9;i++){
            int next= curr*10+i;
            if(next>n) break;
            dfs(next,n,result);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        //Optimal Approach
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=1;i<=9;i++){
            dfs(i,n,result);
        }
        return result;
    }
}