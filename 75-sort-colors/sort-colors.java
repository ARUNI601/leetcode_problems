class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i,j,key;
        for(i=1;i<n;i++)
        {
            key=nums[i];
            for(j=i-1;j>=0;j--)
            {
                if(nums[j]>key)
                {
                    nums[j+1]=nums[j];
                }
                else
                {
                    break;
                }
            }
            nums[j+1]=key;
        }
    }
}