class Solution {
    public int findMin(int[] nums) {
        int l=0;int n=nums.length-1;
        int mid=0;
        {
            while(l<n)
            {
                mid=l+(n-l)/2;
                if(nums[mid]>nums[n])
                {
                    l=mid+1;
                }
                else
                {
                    n=mid;
                }
            }
        }
        return nums[l];
    }
}