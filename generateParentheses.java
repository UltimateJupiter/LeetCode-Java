import java.util.ArrayList;
import java.util.List;

class Solution {
    int cnt;
    List<String> ret = new ArrayList<>();
    private void helper(String str, int open, int close) {
        if (str.length() == cnt * 2) ret.add(str);
        else {
            if (open < cnt) helper(str + "(", open + 1, close);
            if (close < open) helper(str + ")", open, close + 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        cnt = n;
        helper("", 0, 0);
        return ret;
    }
}
