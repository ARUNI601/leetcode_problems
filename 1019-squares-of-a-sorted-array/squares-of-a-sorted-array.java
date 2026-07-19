class Solution {
    public int[] sortedSquares(int[] nums) {    
        int i = 0;
        int j = nums.length - 1;
        int k = j;
        int[] arr = new int[nums.length];
        while (i < j) {
            int iSq = nums[i] * nums[i];
            int jSq = nums[j] * nums[j];
            if (iSq>jSq) {
                arr[k--] = iSq;
                i++;
            } else {
                arr[k--] = jSq;
                j--;
            }
        }
        arr[0] = nums[i] * nums[i];
        return arr;
    }
}