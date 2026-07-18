class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=nums.length;
        int j=l-1;
        int i=0;
        while(i<j)
        {
            if(nums[i]%2==0)
            {
                i++;
            }
            else if(nums[j]%2!=0)
            {
                j--;
            }
            else
            {
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j--;
            }
        }
        return nums;
    }
}