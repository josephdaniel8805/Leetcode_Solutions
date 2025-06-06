import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result= new ArrayList<>();
        int max=0;
        for(int i : candies){
            max=(max<i)?i:max;
        }
        for(int i : candies){
            if((i+extraCandies)>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}