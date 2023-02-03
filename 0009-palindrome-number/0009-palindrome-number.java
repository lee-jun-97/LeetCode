class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) {
            return false;
        }
        
        String str = String.valueOf(x);
        
        StringBuilder sb = new StringBuilder(str).reverse();
        
        return str.equals(sb.toString())?true:false;
        
    }
}