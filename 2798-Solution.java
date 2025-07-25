class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int ind=0;ind<hours.length;ind++){
            if(hours[ind]>=target){
                count++;
            }
        }
        return count;
    }
}