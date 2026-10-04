class Solution {
    public int thirdMax(int[] nums) {
        ArrayList <Integer> adi = new ArrayList<>();

        for (int x : nums){
            if(adi.contains(x) == false){
                adi.add(x);
            }
        }
        Collections.sort(adi, Collections.reverseOrder());        
        if (adi.size() >= 3) {
            return adi.get(2);
        } else {
            return adi.get(0);
        }
        
    }
}