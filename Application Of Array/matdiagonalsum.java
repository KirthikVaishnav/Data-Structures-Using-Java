class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        for(int i=0,j=n-1; i<n; i++,j--) {
            sum += mat[i][i];
            mat[i][i] = 0;      // replacing all the values left to right diagonal with zero after adding
            sum += mat[i][j];    //even if both diagonals intersect it will only add it single time
        }
        
        return sum;
    }
}
