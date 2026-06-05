class Solution {
    public void rotateMatrix(int[][] mat) {
        int m=0,n=0;
        int[][] ans=new int[mat.length][mat.length];
        for(int i=mat.length-1;i>=0;i--){
            n=0;
            for(int j=0;j<mat.length;j++){
                ans[m][n]=mat[j][i];
                n++;
            }
            m++;
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                mat[i][j]=ans[i][j];
            }
        }
    }
}