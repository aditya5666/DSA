        
class Solution {
    public boolean isSubsequence(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {
                i++;
            }

            j++;
        }

        return i == a.length;
    }
}