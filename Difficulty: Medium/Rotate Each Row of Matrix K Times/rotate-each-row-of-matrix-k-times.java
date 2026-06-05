// User function template for java

class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        while(k>=mat[0].length){
            k%=mat[0].length;
        }
        if(k==0){
            return mat;
        }
        
        for(int i=0;i<mat.length;i++){
            int t=k;
            while(t>0){
                int temp=mat[i][0];
                for(int j=1;j<mat[0].length;j++){
                    mat[i][j-1]=mat[i][j];
                }
                mat[i][mat[0].length-1]=temp;
                t--;
            }
        }
        return mat;
    }
}