class Solution {
    public int findPages(int[] arr, int k) {
        int n=arr.length;
        if(k>n){
             return -1;
         }
         long max=0,sum=0;
         for(int i=0;i<n;i++){
             max=Math.max(max,arr[i]);
             sum+=arr[i];
         }
         if(k==1){
             return (int)sum;
         }
         long low=max,high=sum;
         long ans=-1;
         while(low<high){
             long mid=(low+high)/2;
             if(possible(mid,arr,k)){
                 ans=mid;
                 high=mid;
             }
             else{
                 low=mid+1;
             }
         }
         return (int)ans;
        
    }
    
    static boolean possible(long check,int[] arr,int k){

         int size=1;
         int i=0;
         long sum=0;
         while(i<arr.length){
             if(sum+arr[i]<=check){
                 sum=sum+arr[i];
             }
             else{
                 size++;
                 sum=arr[i];
             }
             i++;
         }
         if(size<=k) return true;
         else return false;
    }
}