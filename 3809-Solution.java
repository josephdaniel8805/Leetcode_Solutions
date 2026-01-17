class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int x=-1,y=-1,q=-1;
        for(int ind=0;ind<towers.length;ind++){
            int man=Math.abs(towers[ind][0]-center[0])+Math.abs(towers[ind][1]-center[1]);
            if(man<=radius){
                if(q<towers[ind][2]){
                    q=towers[ind][2];
                    x=towers[ind][0];
                    y=towers[ind][1];
                }else if(q==towers[ind][2]){
                    if(x>towers[ind][0]){
                        x=towers[ind][0];
                        y=towers[ind][1];
                    }else if(x==towers[ind][0] && y>towers[ind][1]){
                        x=towers[ind][0];
                        y=towers[ind][1];
                    }
                }
                
            }
        }
        return new int[]{x,y};
    }
}