class Solution {
    public boolean checkXMatrix(int[][] grid) {

        int n = grid.length;
        int cols = grid[0].length;
        for(int i = 0 ; i < n ; i++){
            if(grid[i][i]== 0){
                return false ;
            }
            for(int j = 0 ; j < cols ; j++){
                if(i + j ==  n - 1 && grid[i][j] == 0  ){
                    return false ;
                    
                }
                else if(i != j && i + j != n - 1 && grid[i][j] != 0) {
                    return false;
                }
            }
        }
        return true ;
    }
}