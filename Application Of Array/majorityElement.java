class Solution {
    public int majorityElement(int[] nums) {
        int v=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==v)
                c++;
            else{
                c--;
                if(c==0){
                    v=nums[i];
                    c=1;
            }
            }
        }
        return v;
    }
}
