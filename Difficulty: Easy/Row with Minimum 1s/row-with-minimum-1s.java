class Solution {
    int minRow(int mat[][]) {
        int min=Integer.MAX_VALUE;
        int min_ind=-1;
        for(int i=mat.length-1;i>=0;i--){
            int cnt=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) cnt++;
            }
            if(cnt<=min){
                min=cnt;
                min_ind=i;
            }
        }
        return min_ind+1;
    }
};