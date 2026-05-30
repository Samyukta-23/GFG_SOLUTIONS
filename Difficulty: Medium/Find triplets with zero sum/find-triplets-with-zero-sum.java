class Solution {
    public boolean findTriplets(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            int j=i+1,k=arr.length-1;
            if(arr[k]<0) break;
            while(j<k){
                if(arr[k]<0) break;
                if(sum+arr[j]+arr[k]==0) return true;
                else if(sum+arr[j]+arr[k]>0) k--;
                else j++;
            }
        }
        return false;
    }
}