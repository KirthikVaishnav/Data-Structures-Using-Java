class Solution {
public boolean isPalindrome(int x) {
   String arr = Integer.toString(x);
   for (int i=0,j=arr.length()-1;i<arr.length()/2;j--,i++)
   {
      if (arr.charAt(i)!=arr.charAt(j))
      return false;
   }
    return true;
  }
}
