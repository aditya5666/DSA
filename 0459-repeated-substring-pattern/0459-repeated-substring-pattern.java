class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        // First character ko dobara dhundho
        for (int i = 1; i < n; i++) {

            if (s.charAt(i) == s.charAt(0)) {

                // Starting se i tak substring
                String sub = s.substring(0, i);

                // Agar original length properly divide nahi hoti
                if (n % sub.length() != 0) {
                    continue;
                }

                // Check karo ki substring repeat karke
                // original string ban rahi hai ya nahi
                String result = "";

                for (int j = 0; j < n / sub.length(); j++) {
                    result += sub;
                }

                if (result.equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}