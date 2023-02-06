class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] result = new int[nums.length];
        
        int idx = 0;
        
        result[0] = nums[0];
        
        for(int i=1; i<n*2; i++) {
            if(i % 2 == 1) {
                result[i] = nums[idx+n];
            } else {
                idx++;
                result[i] = nums[idx];
            }
        }
        
        return result;
    }
}