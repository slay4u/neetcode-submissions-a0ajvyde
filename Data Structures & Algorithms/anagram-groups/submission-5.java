class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Set<List<String>> result = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < strs.length; j++) 
                if (Arrays.equals(strs[i].chars().sorted().toArray(), strs[j].chars().sorted().toArray()) 
                || (strs[i].isBlank() && strs[j].isBlank())) 
                    list.add(strs[j]);
            result.add(list);
        }
        return new ArrayList<>(result);
    }
}