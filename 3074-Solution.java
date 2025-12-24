import java.util.*;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int apples=0;
        for(int app : apple){
            apples+=app;
        }
        Arrays.sort(capacity);
        int boxes=0;
        for(int ind=capacity.length-1;ind>=0;ind--){
            if(apples>0){
                apples-=capacity[ind];
                boxes++;
            }
        }
        return boxes;
    }
}