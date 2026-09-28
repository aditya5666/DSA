class Solution {
    public boolean repeatedSubstringPattern(String s) {

        String temp = s + s;

        temp = temp.substring(1, temp.length() - 1);

        return temp.contains(s);
    }
}