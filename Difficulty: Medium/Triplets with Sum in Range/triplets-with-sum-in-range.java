class Solution {

    public int countTriplets(int[] arr, int l, int r) {
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int sum=arr[i]+arr[j]+arr[k];
                    
                    if(sum<=r && sum>=l) ans++;
                }
            }
        }
        return ans;
    }
}