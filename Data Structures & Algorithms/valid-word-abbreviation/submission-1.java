class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;
        while (i < word.length() && j < abbr.length()) {
            if (Character.isLetter(abbr.charAt(j)) && word.charAt(i) != abbr.charAt(j)) return false;
            if (Character.isDigit(abbr.charAt(j))) {
                if (abbr.charAt(j) == '0') return false;
                StringBuilder s = new StringBuilder();
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    s.append(abbr.charAt(j));
                    j++;
                }
                int a = Integer.parseInt(s.toString());
                i += a;
                continue;
            }
            i++;
            j++;
        }
        return i == word.length() && j == abbr.length();
    }
}