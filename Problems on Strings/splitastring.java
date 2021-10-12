class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int L_count = 0;
        int R_count = 0;
        
        for(int i = 0 ;i < s.length();i++)
        {
            if(s.charAt(i)=='L')
                L_count++;
            else 
                R_count++;
        
            if(L_count == R_count)
            count++;
        }
            
        return count;
        
    }
}
