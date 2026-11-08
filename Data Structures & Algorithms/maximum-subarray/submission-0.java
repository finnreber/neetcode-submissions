class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_max = max_sum;

        for (int i = 1; i < nums.length; i++) {
            current_max = Math.max(current_max + nums[i], nums[i]);
            max_sum = Math.max(max_sum, current_max);
        }
        return max_sum;
    }
}
