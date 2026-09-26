class Solution {
    public int sumOfUnique(int[] nums) {

        int[] count = new int[101];

        // Count frequency
        for (int num : nums) {
            count[num]++;
        }

        int sum = 0;

        // Check unique elements
        for (int num : nums) {
            if (count[num] == 1) {
                sum += num;
            }
        }

        return sum;
    }
}