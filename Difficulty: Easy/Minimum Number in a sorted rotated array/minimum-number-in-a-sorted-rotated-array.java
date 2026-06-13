class Solution {
    static int minNumber(int arr[], int low, int high) {
        int min=Integer.MAX_VALUE;
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]<min){
                min=arr[mid];
                
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[j]<min) min=arr[j];
            if(arr[mid]>arr[i]){
                i=mid+1;
            }
            else{
                j=mid-1;
                
            } 
        }
        return min;
    }
}