class Solution {
    public boolean isHappy(int n) {
        while(true)
        {   n=getNext(n);
            if(n==1 || n==7){
                return true;
            }
            else if(n<10)
            {
                return false;
            }
        }
    }
    private int getNext(int n){
        
        int sum=0;
        while(n>0) {
            int rem = n%10;
            sum+=rem*rem;
            n=n/10;
        }
        return sum;
    }
}
