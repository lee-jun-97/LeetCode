class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        
        int length = Math.min(word1.length(), word2.length());
        
        for(int i=0; i<length; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        
        if(Math.abs(word1.length() - word2.length()) > 0) {
            if(length == word1.length()) {
                sb.append(word2.substring(length));
            } else {
                sb.append(word1.substring(length));
            }
        }
        
        
        return sb.toString();
    }
}