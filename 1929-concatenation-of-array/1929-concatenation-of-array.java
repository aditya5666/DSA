class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int [2*(nums.length)];
        
        for(int i = 0;i < nums.length ; i++){
            ans[i] = nums[i];
            int n = nums.length;
            ans[i+n] = nums[i];
            n++ ;
        }
        return ans ;
    }
}