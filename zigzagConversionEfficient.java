class Solution {
    public boolean isNumber(String s) {
        String standard = "1234567890.e+- ";
        String noSpace = "";
        for (String str: s.split("")){
            if (!standard.contains(s)) return false;
            if (str != " ") noSpace += str;
        }
        if (noSpace.contains("e"))
    }
}