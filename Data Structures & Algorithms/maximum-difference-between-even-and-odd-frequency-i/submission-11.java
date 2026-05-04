class Solution {
    public int maxDifference(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++)
            arr[s.charAt(i) - 'a']++;
        int even = 2000, odd = 0;
        for (int i : arr) {
            if (i == 0) continue;
            if (i % 2 != 0) odd = Math.max(odd, i);
            else even = Math.min(even, i);
        }
        return odd - even;
    }
}