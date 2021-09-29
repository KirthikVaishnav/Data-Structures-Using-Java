class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //i will see the type, color and name if any matches then check corresponding value, if found  then increase the count and return it
        int count=0;
        int k=0;
        if(ruleKey.equals("color")){
            k=1;
        }
        else if(ruleKey.equals("name")){
            k=2;
        }
        for(List b: items){
            if(b.get(k).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
