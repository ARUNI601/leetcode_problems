class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int ro = image.length;
        int c = image[0].length;
        for (int i = 0; i < ro; i++) {
            int l = 0;
            int r = c - 1;
            while (l<=r) {
                int lv = image[i][l];
                int rv = image[i][r];
                image[i][l] = rv ^ 1;
                image[i][r] = lv ^ 1;
                l++;
                r--;
            }
        }
        return image;
    }
}
