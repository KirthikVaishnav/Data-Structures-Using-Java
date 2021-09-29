class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        
        for(int i=0; i<arr.length; i++) {
            int j = i+2, k = i;
            
            result += arr[i]; 
            
            while(k<=j && j<arr.length)   {
                result += arr[k];       
                if(k == j) {
                    k = i;
                    j = j+2;
                } else {
                    k++;
                }
            }
        }
        return result;
    }
}
