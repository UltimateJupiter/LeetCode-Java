class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int tag = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[tag]) {
                tag++;
                nums[tag] = nums[i];
            }
        }
        return tag + 1;
    }
}