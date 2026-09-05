class Solution {
    public int[] shuffle(int[] nums, int n) {
      int[] arr = new int[nums.length] ;
      int j = n ;
      for ( int i = 0 ; i < nums.length/2 ; i++){
        arr[2*i] = nums[i];
        arr[2*i+1] = nums[j];
        j++ ;
        
      }
      return arr ;

    }
}