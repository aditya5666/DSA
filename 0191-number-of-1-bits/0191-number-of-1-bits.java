class Solution {
    public int hammingWeight(int n) {
        
        String binaryString = Integer.toBinaryString(n);
        
        
        int count = 0 ;
        for (int i =0 ; i < binaryString.length() ; i ++){
            if (binaryString.charAt(i)=='1'){
                count ++ ;
            }
        }
        return count ;
        
        
        
        
        
    }
}