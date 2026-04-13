class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a = 0, b = 0, c = 0;
        for (int i : nums) {
            if (i == 1) b=++a;
            else if (c > b) a=b=0;
            else {
                c=b;a=b=0;
            }
        }
        return Math.max(b,c);
    }
}