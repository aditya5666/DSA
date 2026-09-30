class Solution {
    public long removeZeros(long n) {

        long reverse = 0;

        // First reverse
        while (n > 0) {

            long digit = n % 10;
            n = n / 10;

            if (digit != 0) {
                reverse = reverse * 10 + digit;
            }
        }

        // Reverse again
        long ans = 0;

        while (reverse > 0) {

            long digit = reverse % 10;
            reverse = reverse / 10;

            ans = ans * 10 + digit;
        }

        return ans;
    }
}