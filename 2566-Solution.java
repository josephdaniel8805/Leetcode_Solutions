class Solution {
    public int minMaxDifference(int num) {
        String s=Integer.toString(num);
        int max=num,min=num;
        for (char ch : s.toCharArray()) {
            if (ch != '9') {
                String replacedMax = s.replace(ch, '9');
                max = Math.max(max, Integer.parseInt(replacedMax));
                break;
            }
        }
        for (char ch : s.toCharArray()) {
            if (ch != '0') {
                String replacedMin = s.replace(ch, '0');
                min = Math.min(min, Integer.parseInt(replacedMin));
                break; 
            }
        }
        return max-min;
    }
}