class Solution {
   public int numSpecial(int[][] mat) {
        int r[] = new int[mat.length];
        int c[] = new int[mat[0].length];
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1) {
                    r[i]++;
                    c[j]++;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1) {
                    if(r[i] == 1 && c[j] == 1) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
