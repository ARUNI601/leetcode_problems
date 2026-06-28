class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
        int arr[]=new int[l];
        int i=0;
        int j=l/2;
        int k=0;
        while(n>0)
        {
            arr[k]=nums[i];
            k++;
            arr[k]=nums[j];
            i++;
            j++;
            n--;
            k++;
        }
        return arr;
    }
}