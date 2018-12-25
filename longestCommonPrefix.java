class Solution {
    private String common (String a, String b){
        StringBuilder ret = new StringBuilder();
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        for (int i = 0; i < Math.min(aa.length, bb.length); i++){
            if (aa[i] == bb[i]) ret.append(Character.toString(aa[i]));
            else return ret.toString();
        }
        return ret.toString();
        
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String shortest = strs[0];
        for (int i = 1; i < strs.length; i++){
            shortest = common(strs[i], shortest);
        }
        return shortest;
    }
}