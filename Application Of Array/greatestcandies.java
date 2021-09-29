class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> kd = new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                kd.add(true);
            }else{
                kd.add(false);
            }
        }
        
        return kd;
    
    }
}
