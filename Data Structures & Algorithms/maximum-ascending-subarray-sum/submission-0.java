class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = 0, temp = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]) {
                temp += nums[i+1];
            } else {
                sum = Math.max(sum, temp);
                temp = nums[i+1];
            }
        }
        return Math.max(sum, temp);
    }
}