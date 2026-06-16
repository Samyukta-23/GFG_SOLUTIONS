class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int i=0,j=mat.length*mat[0].length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int row=mid/mat[0].length;
            int col=mid%mat[0].length;
            if(mat[row][col]==x) return true;
            else if(mat[row][col]<x) i=mid+1;
            else j=mid-1;
        }
        return false;
    }
}
