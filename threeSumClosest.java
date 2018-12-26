import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ret = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;
        int ndiff = 0, sum = 0;
        for (int i = 0; i < nums.length-2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            while (left < right) {
                sum = nums[left] + nums[right] + nums[i];
                if (sum == target) return target;
                ndiff = Math.abs(sum - target);
                if (ndiff < diff){
                    diff = ndiff;
                    ret = sum;
                }
                if (sum > target) right--;
                else left++;
            }
        }
        return ret;
    }
}