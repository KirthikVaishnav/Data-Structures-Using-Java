class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb= new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){ 
                int resChar =  (char)s.charAt(i)-'0'+s.charAt(i-1);
                sb.setCharAt(i,(char) resChar);
            }
        }
        return sb.toString();
    }
}
