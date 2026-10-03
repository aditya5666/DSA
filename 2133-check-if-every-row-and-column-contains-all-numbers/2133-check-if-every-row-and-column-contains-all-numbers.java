class Solution {
    public boolean checkValid(int[][] matrix) {

        int n = matrix.length;

        // Rows
        for (int i = 0; i < n; i++) {

            boolean[] seen = new boolean[n + 1];

            for (int j = 0; j < n; j++) {

                int num = matrix[i][j];

                if (seen[num]) {
                    return false;
                }

                seen[num] = true;
            }
        }

        // Columns
        for (int j = 0; j < n; j++) {

            boolean[] seen = new boolean[n + 1];

            for (int i = 0; i < n; i++) {

                int num = matrix[i][j];

                if (seen[num]) {
                    return false;
                }

                seen[num] = true;
            }
        }

        return true;
    }
}