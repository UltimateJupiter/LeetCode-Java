class Solution {

    int l = 0;
    int p = 0;
    public int pivot (int i) {
        if (i > l - p) return i + p - l;
        else return i + p;
    }

    public int search(int[] nums, int target) {
        l = nums.length - 1;
        int left = 0, right = nums.length - 1;
        
        while (right - left > 1) { // Binary Search on Pivot
            int mid = (left + right) / 2;
            if (nums[left] > nums[mid]) right = mid;
            else left = mid;
        }

        p = right;
        System.out.println(p);
        left = 0; right = nums.length - 1;

        while (right - left > 0) { // Binary Search on Index
            int mid = (left + right) / 2;
            if (nums[pivot(mid)] == target) return pivot(mid);
            if (nums[pivot(mid)] >= target) right = mid;
            else left = mid + 1;
        }
        return pivot(left);
        
    }
}