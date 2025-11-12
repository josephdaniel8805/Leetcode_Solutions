class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(y-z)<Math.abs(x-z)){
            return 2;
        }else if(Math.abs(y-z)>Math.abs(x-z)){
            return 1;
        }
        return 0;
    }
}
