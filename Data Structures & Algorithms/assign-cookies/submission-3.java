class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int a = 0, size = Math.min(g.length, s.length);
        Arrays.sort(s);
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    s[j] = 0;
                    a++;
                    break;
                }
            }
        }
        return a;
    }
}