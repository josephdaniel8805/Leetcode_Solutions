import java.util.*;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans=0;
        for(int ind=0;ind<seats.length;ind++){
            ans+=(Math.abs(seats[ind]-students[ind]));
        }
        return ans;
    }
}