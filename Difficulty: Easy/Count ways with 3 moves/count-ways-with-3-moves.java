class Solution {

    static int countWays(int n) {
        
        int[] dp=new int[n+1];
         if(n==0)
        return 4;
        if(n<=2) return n;
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}
