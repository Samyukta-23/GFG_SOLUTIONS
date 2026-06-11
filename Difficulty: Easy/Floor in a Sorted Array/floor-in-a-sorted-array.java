class Solution {
    public int findFloor(int[] arr, int x) {
        int i=arr.length-1;
        while(i>=0 && arr[i]>x){
            i--;
        }
        return i;
    }
}
