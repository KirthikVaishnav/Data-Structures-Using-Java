class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int len = nums.length;
        for(int i=0;i<len;i+=2){
            sum += nums[i];
        }
        return sum;

    }
}
