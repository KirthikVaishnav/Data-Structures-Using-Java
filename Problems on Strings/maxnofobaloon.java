class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] frequencies = new int[26];
        String balloon = "balloon";
        for (char ch : text.toCharArray()) {
            frequencies[ch - 97]++;
        }
        int count = 0;
        boolean x = true;
        while (x) {
            x = true;
            for (int i = 0; i < balloon.length(); i++) {
                char c = balloon.charAt(i);
                frequencies[c - 97]--;
                if (frequencies[c - 97] < 0) {
                    x = false;
                    break;
                }
            }
            if (x) count++;
        }
        return count;
    }
}
