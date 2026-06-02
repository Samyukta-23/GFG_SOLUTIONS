class Solution {
    int maxSubarraySum(int[] arr) {
        int max=Integer.MIN_VALUE,curr=0;
        for(int n:arr){
           curr+=n;
           if(curr>max) max=curr;
           if(curr<0) curr=0;
        }
        return max;
    }
}
