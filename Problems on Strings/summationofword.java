class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getNum(firstWord) + getNum(secondWord) == getNum(targetWord);
    }
    public int getNum(String s) {
        String result = "";
        for (int i=0; i<s.length(); i++) {
            result += (s.charAt(i) - 97) + "";
        }
        return Integer.parseInt(result);
    }
}
