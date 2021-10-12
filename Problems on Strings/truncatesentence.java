class Solution {
    public String truncateSentence(String s, int k) {
        int space=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                space++;
            }
            if(space==k)
            {
                return s.substring(0,i);
            }
        }
        return s;
    }
}
