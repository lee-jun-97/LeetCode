class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String result = "";
        
        if(strs.length == 1) {
            return strs[0];
        }
        
        for(int i=0; i<=strs[0].length(); i++) {
            String temp = strs[0].substring(0,i);
            
            boolean check = true;
            
            for(int j=0; j<strs.length; j++) {
                if(!strs[j].startsWith(temp)) {
                    check = false;
                }
            }
            
            if(check) {
                result = temp;
            }
        }
        
        return result;
    }
}