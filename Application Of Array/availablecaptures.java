class Solution {
    public int numRookCaptures(char[][] board) {
        int height = board.length;
        int width = board[0].length;
        int rWidth = 0, rHeight = 0;
        int attackCount = 0;
        
        //Find the location of R
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                if (board[i][j]=='R') {
                    rWidth = j;
                    rHeight = i;
                }
            }
        }
        
        //R to left 
        for (int i=rWidth-1; i>=0; i--) {
            if (board[rHeight][i]=='p') {
                attackCount++;
                break;
            }
            if (board[rHeight][i]=='B') {
                break;
            }  
        }
        //R to right 
        for (int i=rWidth+1; i<width; i++) {
            if (board[rHeight][i]=='p') {
                attackCount++;
                break;
            }
            if (board[rHeight][i]=='B') {
                break;
            }  
        }
        //R to Top 
        for (int i=rHeight-1; i>=0; i--) {
            if (board[i][rWidth]=='p') {
                attackCount++;
                break;
            }
            if (board[i][rWidth]=='B') {
                break;
            }  
        }
        //R to Bottom 
        for (int i=rHeight+1; i<height; i++) {
            if (board[i][rWidth]=='p') {
                attackCount++;
                break;
            }
            if (board[i][rWidth]=='B') {
                break;
            }  
        }
        return attackCount;
    }
}
