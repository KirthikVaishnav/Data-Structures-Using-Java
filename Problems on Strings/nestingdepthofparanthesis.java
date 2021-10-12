class Solution {
    public int maxDepth(String s) {
        int count = 0, max_count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') {
                count++;
            } else if(s.charAt(i)==')') {
                count--;
            }
            max_count = Math.max(count,max_count);
        }
        return max_count;
    }
}
