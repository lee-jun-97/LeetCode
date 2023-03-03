class Solution {
    public int strStr(String haystack, String needle) {
        
        if(!haystack.contains(needle) || haystack.length() == 0) {
            return -1;
        }
        
        return haystack.indexOf(needle);
        
    }
}