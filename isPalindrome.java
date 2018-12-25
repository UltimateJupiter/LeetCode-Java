class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int major = 0;
        while (x > major){
            major = major * 10 + x%10;
            x = x/10;
        }
        if (x == major || x == major / 10) return true;
        return false;
    }
}