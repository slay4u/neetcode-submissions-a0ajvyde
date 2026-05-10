class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (set.contains(grid[i][j])) res[0] = grid[i][j];
                set.add(grid[i][j]);
            }
        }
        for (int i = 0; i < grid[0].length * grid[0].length; i++) {
            if (!set.contains(i+1)) res[1] = i+1;
        }
        return res;
    }
}