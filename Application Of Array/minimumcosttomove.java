class Solution {
    public int minCostToMoveChips(int[] chips) {
        int even = 0, odd = 0;
        for (int i = 0; i < chips.length; i++) {
            if (chips[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        return odd > even ? even : odd;
    }
}
