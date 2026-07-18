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
                if(rv==0)
                {
                    image[i][l]=1;
                }
                else
                {
                    image[i][l]=0;
                }
                if(lv==0)
                {
                    image[i][r]=1;
                }
                else
                {
                    image[i][r]=0;
                }  
                l++;
                r--;
            }
        }
        return image;
    }
}
