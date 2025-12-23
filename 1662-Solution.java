class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String w : word1){
            sb1.append(w);
        }
        for(String w : word2){
            sb2.append(w);
        }
        if(sb1.length()!=sb2.length()) return false;
        for(int ind=0;ind<sb1.length();ind++) if(sb1.charAt(ind)!=sb2.charAt(ind)) return false;
        return true;
    }
}