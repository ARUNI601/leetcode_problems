class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0,high=0;
        for(int num:nums){
            high+=num;
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            int sum=0;
            int count=1;
            for(int num:nums)
            {
                if(num>mid)
                {
                    count+=k;
                }
                if(mid<sum+num)
                {
                    count++;
                    sum=num;
                }
                else
                {
                    sum+=num;
                }
            }
            if(count <=k)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}