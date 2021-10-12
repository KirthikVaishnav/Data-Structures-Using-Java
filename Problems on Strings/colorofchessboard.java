class Solution {
public boolean squareIsWhite(String coordinates) {
            
char row = coordinates.charAt(0);
char col = coordinates.charAt(1);

if( row == 'a' || row == 'c' || row == 'e' ||  row == 'g' )
   
    return col % 2 == 0;
 else
	return col % 2 == 1;
	
	}
}
