class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
         String a="";
        String b="";
         for(int i=0;i<word1.length;i++)
         {
             a+=word1[i];
         }
          for(int i=0;i<word2.length;i++)
         {
             b+=word2[i];
         }
        if(a.equals(b))return true;
        else return false;
    }
}
