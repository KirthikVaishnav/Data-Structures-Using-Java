class Solution {
    public int singleNumber(int[] nums) {
        int snum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            snum=snum^nums[i];
        }
        return snum;
    }
}
