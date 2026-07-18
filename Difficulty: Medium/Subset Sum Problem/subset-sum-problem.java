class Solution {
    static boolean ans;
    static boolean isSubsetSum(int arr[], int sum) {
        // Arrays.sort(arr)
        ans=false;
        return helper(arr,0,0,sum);
    }
    
    static boolean helper(int[] arr,int in,int s,int sum){
        if(s==sum){
            return true;
        }
        if(s>sum) return false;
        
        for(int i=in;i<arr.length;i++){
            s+=arr[i];
            ans=helper(arr,i+1,s,sum);
            if(ans){
                return true;
            }
            s-=arr[i];
        }
        return ans;
    }
}