class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int b = nums[i];
                nums[i] = nums[a];
                nums[a] = b; 
                a++;
            }
        }
    }
}