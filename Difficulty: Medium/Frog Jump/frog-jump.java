class Solution {
    int ans;
    int[] a;
    int minCost(int[] height) {
        a=new int[height.length];
        Arrays.fill(a,-1);
        ans=Integer.MAX_VALUE;
        if(height.length<=1) return 0;
        if(height.length==2){
            return Math.abs(height[0]-height[1]);
        }
        return helper(height,height.length-1); 
    }
    
    int helper(int[] arr,int in){
        if(in==0){
            return 0;
        }
        if(a[in]!=-1) return a[in];
        int left = helper(arr,in-1)+(Math.abs(arr[in]-arr[in-1]));
        if(in-2>=0){
            int right=helper(arr,in-2)+(Math.abs(arr[in]-arr[in-2]));
            a[in]=Math.min(left,right);
            return Math.min(left,right);
        }
        else return left;
        
    }
}