// class Solution {

//     public int findNumbers(int[] nums) {
//         int count = 0;

//         for (int num : nums) {
//             if (even(num)) {
//                 count++;
//             }
//         }

//         return count;
//     }

//     static boolean even(int num) {
//         int numberOfDigits = digits(num);

//         if (numberOfDigits % 2 == 0) {
//             return true;
//         }

//         return false;
//     }

//     static int digits(int num) {
//         int count = 0;

//         while (num > 0) {
//             count++;
//             num /= 10;
//         }

//         return count;
//     }
// }

class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            String str = String.valueOf(nums[i]);

            if (str.length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}