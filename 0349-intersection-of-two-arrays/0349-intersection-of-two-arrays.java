class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] count = new int[1001];

        for (int num : nums1) {
            count[num]++;
        }

        int[] temp = new int[1000];
        int k = 0;

        for (int num : nums2) {

            if (count[num] > 0) {
                temp[k] = num;
                k++;

                count[num] = 0;
            }
        }

        // Exact size ka answer
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = temp[i];
        }

        return ans;
    }
}