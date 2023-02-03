class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) {
            return false;
        }
        
        char[] c = String.valueOf(x).toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for(char i : c) {
            sb.append(i);
        }
        
        return String.valueOf(x).equals(sb.reverse().toString())?true:false;
        
    }
}