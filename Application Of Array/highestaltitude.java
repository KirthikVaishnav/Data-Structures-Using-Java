class Solution {
    public int largestAltitude(int[] gain) {
     
        int alt[] = new int[gain.length+1];
        int j = 1;
        int max = 0;
        for(int i=0;i<gain.length;i++){
            alt[j]=alt[j-1] + gain[i];
            if(alt[j]>max){
                max=alt[j];
            }
            j++;
        }
        return max;
    }

}
