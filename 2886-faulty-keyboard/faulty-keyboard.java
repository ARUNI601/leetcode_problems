class Solution {
    public String finalString(String s) {
        String v = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'i') {
                v += s.charAt(i);
            } else {
                v = new StringBuilder(v).reverse().toString();
            }
        }

        return v;
    }
}