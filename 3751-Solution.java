class Solution {
    public int totalWaviness(int num1, int num2) {
        int waves=0;
        for(int ind=num1;ind<=num2;ind++){
            String s=Integer.toString(ind);
            for(int i=1;i<s.length()-1;i++){
                if(s.charAt(i-1)<s.charAt(i) && s.charAt(i)>s.charAt(i+1)){
                    waves++;
                }else if(s.charAt(i-1)>s.charAt(i) && s.charAt(i)<s.charAt(i+1)){
                    waves++;
                }
            }
        }
        return waves;
    }
}