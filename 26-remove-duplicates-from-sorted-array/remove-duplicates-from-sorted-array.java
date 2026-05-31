class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int l=nums.length;
        if(l>1)
        {
            for(int j=1;j<l;j++)
            {
                if(nums[j]!=nums[i])
                {
                    i++;
                    nums[i]=nums[j];
                }
                else
                {
                    continue;
                }

            }
            l=i+1;
        }
        else
        {
            return l;
        }
        return l;
    }
}