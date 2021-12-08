class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
       }
        else{
            
            char sc[]=s.toCharArray();
            char st[]=t.toCharArray();
            Arrays.sort(sc);
            Arrays.sort(st);
            boolean a= Arrays.equals(sc,st)?  true:  false;
            return a;
        }
        
    }     
    
}
