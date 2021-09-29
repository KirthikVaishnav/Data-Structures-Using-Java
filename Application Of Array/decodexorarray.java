class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] decode=new int[encoded.length+1];
        decode[0]=first;
        int value;
        for(int i=0;i<encoded.length;i++)
        {
            decode[i+1]=decode[i]^encoded[i];
        }
        return decode;
    }
}
