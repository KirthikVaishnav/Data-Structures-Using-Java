class Solution {
    public int search(int[] nums, int target) {
        int ind=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                ind=i;
            }
        }
        return ind;
        
    }
}
