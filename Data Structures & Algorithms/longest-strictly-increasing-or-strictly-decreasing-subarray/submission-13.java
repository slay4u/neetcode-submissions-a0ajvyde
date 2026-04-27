class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int a = 1, b = 1, c = 0, d = 0, e = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1]) {
                a++;
                c = Math.max(c, b);
                b = 1;
            }
            else if (nums[i] < nums[i + 1]) {
                b++;
                c = Math.max(c, a);
                a = 1;
            }
            else {
                e = Math.max(a, b);
                d = Math.max(d, e);
                a = 1;
                b = 1;
            }
        }
        e = Math.max(a, b);
        d = Math.max(d, e);
        if (d > c) return d;
        return c;
    }
}