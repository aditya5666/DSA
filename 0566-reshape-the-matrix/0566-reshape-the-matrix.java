class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat[0].length ;
        int n = mat.length ;
        if(m*n != r*c){
            return mat ;

        }
        int [][] ans = new int [r][c] ;
        int k = 0 ;
        for (int i = 0 ; i<n ; i++){
            for(int j = 0 ; j < m ; j++){
                ans[k / c][k % c] = mat[i][j];

                k++;
            }
        } 
        return ans ;
    }
}