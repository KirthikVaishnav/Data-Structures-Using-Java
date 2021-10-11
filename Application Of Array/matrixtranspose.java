class Solution {
    public int[][] transpose(int[][] A) {
       int rows=A.length;
        int coloum=A[0].length;
        int[][] ans=new int[coloum][rows];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                ans[j][i]=A[i][j];
            }
        }
        return ans;
    }
}
