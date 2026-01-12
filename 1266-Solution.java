class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int x=points[0][0],y=points[0][1],dist=0;
        for(int ind=1;ind<points.length;ind++){
            dist+=(Math.max(Math.abs(points[ind][0]-x),Math.abs(points[ind][1]-y)));
            x=points[ind][0];y=points[ind][1];
        }
        return dist;
    }
}