class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> t = new ArrayList<>();
        t.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(0);
            temp.addAll(t.get(t.size()-1));
            temp.add(0);
            List<Integer> r = new ArrayList<>();
            for (int j = 0; j < t.get(t.size()-1).size()+1; j++) 
                r.add(temp.get(j)+temp.get(j+1));
            t.add(r);
        }
        return t;
    }
}