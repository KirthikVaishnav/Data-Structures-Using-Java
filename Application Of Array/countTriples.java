class Solution {
    public int countTriples(int n) {
        if(n<5)
            return 0;
        int ans=0;
        for(int i=3;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                int x=(i*i)+(j*j);
                int y = (int)Math.sqrt(x);
                if(y > n)
                    break;
                if(y*y == x){
                	ans = ans + 2;
            }
        }
        }
        return ans;
    }
}
