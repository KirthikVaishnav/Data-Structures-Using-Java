class Solution {
    public int[] sumZero(int n) {
        int[] s=new int[n];
        int i=0;
        int j=n-1;
        while(i<j)
        {
            s[i]=j;
            s[j]=-1*j;
            i++;
            j--;
        }
        return s;
    }
}
