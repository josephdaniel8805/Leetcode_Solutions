import java.util.*;
class Solution {
    public int countTriples(int n) {
        ArrayList<Integer> sq= new ArrayList<>();
        int count=0;
        for(int ind=1;ind<=n;ind++){
            sq.add((ind*ind));
        }
        for(int row=0;row<sq.size();row++){
            for(int col=row+1;col<sq.size();col++){
                if(sq.contains((sq.get(row)+sq.get(col)))) count+=2;
            }
        }
        return count;
    }
}