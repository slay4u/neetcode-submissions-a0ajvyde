class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            StringBuilder str = new StringBuilder();
            int i = 0;
            while (i < s.length()) {
                if (s.charAt(i) == '.') {
                    i++;
                    continue;
                }
                if (s.charAt(i) == '+') {
                    while (s.charAt(i) != '@') {
                        i++;
                        continue;
                    }
                    str.append(s.substring(i));
                }
                str.append(s.charAt(i));
                i++;
            }
            set.add(str.toString());
            str.setLength(0);
        }
        return set.size();
    }
}