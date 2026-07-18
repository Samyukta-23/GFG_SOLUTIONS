class Solution {
    public int findMin(int n) {
        // code here
        int[] coins={10,5,2};
        int sum=0;
        for(int num:coins){
            sum+=n/num;
            n=n-(num*(n/num));
        }
        return sum+n;
        
    }
}
