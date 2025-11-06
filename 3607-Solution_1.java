import java.util.*;
class Solution {
    //Brute Force Approach Memory Limited Exceeded
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        ArrayList<TreeMap<Integer,Boolean>> grid = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[c+1];
        int adj[][]= new int[c+1][c+1];
        for(int ind=0;ind<connections.length;ind++){
            adj[connections[ind][0]][connections[ind][1]]=1;
            adj[connections[ind][1]][connections[ind][0]]=1;
        }
        for(int ind=1;ind<=c;ind++){
            if(!visited[ind]){
                TreeMap<Integer,Boolean> component = new TreeMap<>();
                dfs(ind,adj,visited,component,c);
                grid.add(component);
            }
        }
        for(int ind=0;ind<queries.length;ind++){
            int type=queries[ind][0];
            int node=queries[ind][1];
            TreeMap<Integer,Boolean> comp =null;
            for(TreeMap<Integer,Boolean> map : grid){
                if(map.containsKey(node)){
                    comp=map;
                    break;
                }
            }
            if(comp==null) continue;
            if(type==1){
                if(comp.get(node)){
                    ans.add(node);
                }else{
                    Integer smallest=null;
                    for(Map.Entry<Integer,Boolean> entry : comp.entrySet()){
                        if (entry.getValue()) {
                            smallest=entry.getKey();
                            break;
                        }
                    }
                    ans.add(smallest!=null ? smallest : -1);
                }
            } else{
                comp.put(node,false);
            }
        }
        int res[]= new int[ans.size()];
        for(int ind=0;ind<ans.size();ind++){
            res[ind]=ans.get(ind);
        }
        return res;
    }
    private static void dfs(int node, int adj[][], boolean visited[], TreeMap<Integer,Boolean> component,int c){
        visited[node]=true;
        component.put(node,true);
        for(int ind=1;ind<=c;ind++){
            if(adj[node][ind]==1 && !visited[ind]){
                dfs(ind,adj,visited,component,c);
            }
        }
    }
}