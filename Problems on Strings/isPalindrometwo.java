class Solution {
    public boolean isPalindrome(String s) {
        String g="";
        for(char c:s.toCharArray()){
            if (Character.isLetterOrDigit(c)) {
                g += Character.toUpperCase(c);
        }
            
    }
     return g.equals(new StringBuffer(g).reverse().toString());
}
}
