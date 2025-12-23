class Solution {
    public int findMin(int[] nums) {
        int l=0;int n=nums.length-1;
        Arrays.sort(nums);
        int mid=0;
        {
            while(l<n)
            {
                mid=l+(n-l)/2;
                if(nums[mid]<nums[mid+1])
                {
                    n=mid;
                }
                else
                {
                    l=mid+1;
                }
            }
        }
        return nums[l];
    }
}