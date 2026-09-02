class Solution {
    public int[] runningSum(int[] nums) {
       int[] runningSum = new int [nums.length] ;
       int sum = 0 ;
       for ( int i = 0 ; i < nums.length ;  i ++ ){
        runningSum [i] = sum + nums[i] ;
        sum = runningSum[i] ;
       }
       return runningSum ;

    }
}