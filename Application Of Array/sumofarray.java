class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] temp=new int[nums.length];
        int sum=0; 
        for(int i=0;i<n;i++)
         {
             sum=sum+nums[i];
            nums[i]=sum;
         }
        return nums;
  }
}
