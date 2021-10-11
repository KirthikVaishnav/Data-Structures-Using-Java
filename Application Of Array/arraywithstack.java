class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList(); // result
        int i = 0;
        int j = 0;
        while(i <= n && j < target.length) { //i should run to the length of n, j should be to the length of the target
            list.add("Push"); // by default add Push
            if(target[j] == i+1) j++;  //if target index do not match
            else list.add("Pop");   //only add Pop for mismatch
            i++;
        }
        return list;
    }
}
