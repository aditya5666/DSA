class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int count1 = 0 ;
        int rowIndex = 0 ;
        for(int i =0 ; i < mat.length ; i++){
            int count = 0 ;
            for(int j =0 ; j <mat[i].length ; j++){
                if(mat[i][j] == 1){
                    count++ ;
                    
                }
                
            }
            if(count > count1){
                count1 = count ;
                rowIndex = i ;
            }
        }
        return new int[]{rowIndex, count1}; 

    }
}