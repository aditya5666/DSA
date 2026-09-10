class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int X = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("++X") || operations[i].equals("X++")) { // .equals is use beacuse it is string an in that we cxannot compare 
                X++;
            } else {
                X--;
            }
        }

        return X;
    }
}