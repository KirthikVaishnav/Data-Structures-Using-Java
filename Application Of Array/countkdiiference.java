class Solution {
    public int countKDifference(int[] nums, int k) {
         int i,j,count=0;
        
        for(i=0; i<nums.length-1; i++)
        {
            for(j=i+1; j<nums.length; j++)
            {
                if(Math.abs(nums[i] - nums[j]) == k)
                    count++;
            }
        }
        
        return count;
    }
}
