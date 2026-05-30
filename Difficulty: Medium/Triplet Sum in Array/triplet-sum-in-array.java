class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int tar=target-arr[i];
            int j=i+1,k=arr.length-1;
            while(j<k){
                if(arr[j]+arr[k]==tar) return true;
                else if(arr[j]+arr[k]>tar) k--;
                else j++;
            }
        }
        return false;
    }
}
