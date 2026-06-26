class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int t = 0, s = 0;
        arr1[t++] = nums[0];
        arr2[s++] = nums[1];
        for(int i=2;i<nums.length;i++) {
            if(arr1[t-1]>arr2[s-1]) {
                arr1[t++] = nums[i];
            }
            else {
                arr2[s++] = nums[i];
            }
        }
        int[] result = new int[nums.length];
        int k = 0;
        for(int i=0;i<t;i++)
            result[k++] = arr1[i];
        for(int i=0;i<s;i++)
            result[k++] = arr2[i];
        return result;
    }
}