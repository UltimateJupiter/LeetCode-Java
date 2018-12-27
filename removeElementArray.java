class Solution {
    public int removeElement(int[] nums, int val) {
        int mark = 0;
        for (int i: nums){
            if (i != val){
                nums[mark] = i;
                mark++;
            }
        }
        return mark;
    }
}