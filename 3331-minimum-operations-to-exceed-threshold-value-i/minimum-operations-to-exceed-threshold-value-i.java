class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int t=0;
        Arrays.toString(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<k)
            {
                t++;
            }
        }
        return t;
    }
}