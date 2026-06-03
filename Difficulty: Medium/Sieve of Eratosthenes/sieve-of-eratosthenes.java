class Solution {
    public int[] sieve(int n) {
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        int cnt=0;
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                cnt++;
                int j=i+i;
                while(j<=n){
                    isPrime[j]=false;
                    j+=i;
                }
            }
        }
        int[] ans=new int[cnt];
        cnt=0;
        for(int i=0;i<isPrime.length;i++){
            if(isPrime[i]){
                ans[cnt++]=i;
            }
        }
        return ans;
        
    }
}