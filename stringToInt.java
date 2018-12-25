class Solution {
    public int myAtoi(String str) {
        String basic = "1234567890";
        String[] split = str.split("");
        boolean start = false;
        int negative = 1;
        int ret = 0;
        for (String s: split){
            if (s.equals("") || s.equals(" ")){
                if (!start) continue;
                else return ret * negative;
            }
            else if (s.equals("-")){
                if (!start){
                    negative = -1;
                    start = true;
                    continue;
                }
                else return ret * negative;
            }
            else if (!basic.contains(s)){
                if (!start) return 0;
                else return ret * negative;
            }
            else{
                ret *= 10;
                ret += Integer.parseInt(s);
            }
            if (ret * 10 > Integer.MAX_VALUE) return Integer.MIN_VALUE;
        }
        return ret * negative;
    }
}