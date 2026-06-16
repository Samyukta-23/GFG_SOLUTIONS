class Solution {
    public int rowWithMax1s(int[][] arr) {
        int ans=-1;
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]==1) return i;
            if(arr[i][arr[i].length-1]==0) continue;
            int low=0,high=arr[i].length-1;
            boolean change=false;
            while(low<high){
                int mid=low+(high-low)/2;
                if(arr[i][mid]==0){
                    low=mid+1;
                    change=true;
                }
                else high=mid;
            }
            if(change){
                if(max<arr[0].length-high+1){
                    max=arr[0].length-high+1;
                    ans=i;
                }
            }
        }
        return ans;
    }
}