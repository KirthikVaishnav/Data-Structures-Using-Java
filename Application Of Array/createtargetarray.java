class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(index[i]+1 < output.length){
                System.arraycopy(output, index[i], output, index[i]+1, output.length-index[i]-1);
            }
            output[index[i]] = nums[i];
        }
        return output;
    }
}
