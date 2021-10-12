class Solution {
    public int[] diStringMatch(String s) {
        
        
        int arr[] = new int[s.length()+1];
        
        int I = 0;
        int D = s.length();
        int i=0;
        
        for(char c:s.toCharArray()){ 
            if(c=='D'){
                arr[i] = D--;
            }else{
                arr[i] = I++;
            } 
            i++;
        }
        
        arr[arr.length-1] = I; 
        
        return arr;
    }
}
