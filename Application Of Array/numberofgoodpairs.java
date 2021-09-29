class Solution {
    public int numIdenticalPairs(int[] nums) {
        int numGoodPairs = 0;
        
        
        if (nums.length == 0) {
            return 0;
        }
        
        
        if (nums.length == 1) {
            return 0;
        }
        
        
        for (int i = 0; i < nums.length - 1; i += 1) {
            for (int j = i + 1; j < nums.length; j += 1) {
                
                    if (nums[i] == nums[j]) {
                    numGoodPairs += 1;
                }
            }
        }
        
        return numGoodPairs;
    }
}
