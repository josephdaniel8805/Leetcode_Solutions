class Solution {
    public String reversePrefix(String word, char ch) {
        int mark=word.length();
        StringBuilder sb = new StringBuilder();
        for(int ind=0;ind<word.length();ind++){
            if(word.charAt(ind)==ch){
                mark=ind;
                for(int j=mark;j>=0;j--){
                    sb.append(word.charAt(j));
                }
                break;
            }
        }
        for(int ind=mark+1;ind<word.length();ind++){
            sb.append(word.charAt(ind));
        }
        if(mark==word.length()) return word;
        return sb.toString();
    }
}