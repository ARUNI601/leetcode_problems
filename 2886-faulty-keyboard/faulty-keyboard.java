class Solution {
    public String finalString(String s) {
        char[] t = new char[s.length()];
        int sz = 0;
        for (char c : s.toCharArray()) {
            if (c != 'i') {
                t[sz++] = c;
            } else {
                for (int i = 0, j = sz - 1; i < j; i++, j--) {
                    char tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                }
            }
        }
        return new String(t, 0, sz);
    }
}