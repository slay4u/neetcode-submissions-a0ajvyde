class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) 
            set.add(i+1);
        for (int i = 0; i < nums.length; i++) 
            if (set.contains(nums[i])) set.remove(nums[i]);
        return new ArrayList<>(set);
    }
}