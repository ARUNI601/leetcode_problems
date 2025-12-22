class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int d=n-k;
        int[] arr = new int[n];
        int j = 0;
        for (int i=d;i<n;i++)
            arr[j++]=nums[i];
        for (int i=0;i<d;i++)
            arr[j++]=nums[i];
        System.arraycopy(arr, 0, nums, 0, n);
    }
}
