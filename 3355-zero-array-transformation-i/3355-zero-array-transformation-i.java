class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {

        int n = nums.length;
        int[] diff = new int[n + 1];

        // Store the effect of every query
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];

            diff[l]++;
            diff[r + 1]--;
        }

        // Calculate coverage using prefix sum
        int count = 0;

        for (int i = 0; i < n; i++) {

            count += diff[i];

            // Not enough queries to make nums[i] zero
            if (count < nums[i]) {
                return false;
            }
        }

        return true;
    }
}