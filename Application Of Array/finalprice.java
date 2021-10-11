class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length<=2)
            return true;
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++)
        {
            if((arr[i+1]-arr[i])!=(arr[i]-arr[i-1]))
                return false;
        }
        return true;
    }
}
