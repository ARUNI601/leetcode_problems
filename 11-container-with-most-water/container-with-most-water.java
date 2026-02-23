class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0,area=0;
        while (i < j) 
        {
            if(height[i]<height[j])
            {
                area=height[i]*(j-i);
            }
            else
            {
                area=height[j]*(j-i);
            }
            if(max<area)
            {
                max=area;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}