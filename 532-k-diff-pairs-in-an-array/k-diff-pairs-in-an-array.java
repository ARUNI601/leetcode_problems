class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<List<Integer>> set = new HashSet<>();
        int i,j;
        for(i=0;i<nums.length;i++)
        {
            for(j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(nums[i]-nums[j]==k)
                    {
                        set.add(Arrays.asList(Math.min(nums[i],nums[j]),Math.max(nums[i],nums[j])));
                    }
                }
            }
        }
        return set.size();
    }
}