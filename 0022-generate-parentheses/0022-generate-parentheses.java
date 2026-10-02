class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        backtrack("", 0, 0, n, ans);

        return ans;
    }

    private void backtrack(String str, int open, int close,
                           int n, List<String> ans) {

        // complete combination
        if (str.length() == 2 * n) {
            ans.add(str);
            return;
        }

        // opening bracket
        if (open < n) {
            backtrack(str + "(", open + 1, close, n, ans);
        }

        // closing bracket
        if (close < open) {
            backtrack(str + ")", open, close + 1, n, ans);
        }
    }
}