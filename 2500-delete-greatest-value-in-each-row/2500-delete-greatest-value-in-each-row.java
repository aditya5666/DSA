

class Solution {
    public int deleteGreatestValue(int[][] grid) {

        int answer = 0;

        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

         
        for (int j = grid[0].length - 1; j >= 0; j--) { 

            int max = 0;

            for (int i = 0; i < grid.length; i++) {

                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }

            answer = answer + max;
        }

        return answer;
    }
}