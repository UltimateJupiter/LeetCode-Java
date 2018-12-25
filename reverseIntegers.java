class Solution {
    public int reverse(int x) {
        boolean revert = x < 0;
        if (revert) x = -x;
        int ret = 0;
        while(x > 0){
            if (ret > Integer.MAX_VALUE/10 || (ret == Integer.MAX_VALUE / 10 && x%10 > 7)) return 0;
            ret = ret * 10;
            ret += x%10;
            x = x/10;
        }
        if (revert) ret = -ret;
        return ret;
    }
}