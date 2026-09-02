class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0 ;
        for ( int row =0 ; row <accounts.length ; row ++){
            int max =0 ;
            for(int col = 0 ; col < accounts[row].length ;col++){
               max = max + accounts[row][col];
               if (max>maxwealth){
                maxwealth = max ;
               }
                                            
               
            }

        }
        return maxwealth ;

    }
}