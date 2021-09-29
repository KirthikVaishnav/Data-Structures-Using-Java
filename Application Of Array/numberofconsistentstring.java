class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        for(int i=0;i<words.length;i++){
            String inp = words[i];
            int temp_count = 0;
            for(int j=0;j<inp.length();j++){
               if(allowed.indexOf(inp.charAt(j)) == -1){
                   break;
               }else{
                   temp_count +=1;
               }
            }
            if(temp_count == inp.length()){
                res+=1;
            }
        }
        return res;
    }
}
