class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int answer=0;
        for(int i=0;i<words.length;i++){
            int c=0,in=0;
            for(Character ch : words[i].toCharArray()){
                c++;
                if(allowed.contains(String.valueOf(ch))){
                    in++;
                }
            }
            if(c==in){
                answer++;
                c=0;
                in=0;
            }
        }
        return answer;     
    }
}