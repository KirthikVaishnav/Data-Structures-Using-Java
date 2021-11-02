class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder arr=new StringBuilder();
        int ind=word.indexOf(ch);
        if(ind==-1)return word;
        for(int i=ind;i>=0;i--)
        {
            arr.append(word.charAt(i));
        }
        arr.append(word.substring(ind+1,word.length()));
            return arr.toString();
    }
}
