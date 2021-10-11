class Solution {
    public int maximumWealth(int[][] accounts) {
       int m = accounts.length;
        int wealth = 0; 
        int maxWealth = 0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<accounts[i].length;j++){
                wealth+= accounts[i][j];
            }
            if(maxWealth <= wealth){
                maxWealth = wealth;
            }
            wealth = 0;
        }
        return maxWealth;
    }
}
