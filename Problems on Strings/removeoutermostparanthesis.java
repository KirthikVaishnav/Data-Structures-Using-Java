class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character> st=new Stack();
        StringBuilder sb=new StringBuilder();
        for(char ch:S.toCharArray())
        {
            if(ch=='(')
            {
                 if(st.size()>=1)
                 {
                     sb.append(ch);
                 }
                st.push(ch);
            }
            else{
                if(st.size()>1)
                 {
                     sb.append(ch);
                 }
                st.pop();
            }
        }
        return sb.toString();
    }
}
