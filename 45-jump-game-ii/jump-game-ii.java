class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int steps=0;
        int mxr=0;
        int curend=0;
        if(n<=1)
        {
            return 0;
        }
        for(int i=0;i<n-1;i++)
        {
            mxr=Math.max(mxr,i+nums[i]);
            if(i==curend)
            {
                steps++;
                curend=mxr;
            }
        }
        return steps;
    }
}