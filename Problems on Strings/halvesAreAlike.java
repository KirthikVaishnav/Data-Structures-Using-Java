class Solution {
    public int vowel(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
            return count;
    }
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int h=s.length()/2;
        String a=s.substring(0,h);
        String b=s.substring(h);
        return (vowel(a) == vowel(b));
    }
}
