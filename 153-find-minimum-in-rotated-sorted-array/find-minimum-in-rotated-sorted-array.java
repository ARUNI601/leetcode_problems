class Solution {
    public int findMin(int[] nums) {
        int l=0;int n=nums.length-1;
        Arrays.sort(nums);
        return nums[0];
    }
}