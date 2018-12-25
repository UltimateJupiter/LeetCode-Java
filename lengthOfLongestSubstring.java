import java.util.HashSet;

class Solution {

    String[] s_split;
    public boolean valid(int start, int end) {
        HashSet<String> tmp = new HashSet<>();
        for (int i = start; i < end; i++){
            if (tmp.contains(s_split[i])) return false;
            tmp.add(s_split[i]);
        }
        return true;
    }

    public int lengthOfLongestSubstring(String s) {
        s_split = s.split("");
        int length = 0;
        for (int start = 0; start < s_split.length; start++) {
            while (valid(start, start + length + 1)) {
                length += 1;
                if (start + length + 2 > s.length()) return length;
            }
        }
        return length;
    }
}