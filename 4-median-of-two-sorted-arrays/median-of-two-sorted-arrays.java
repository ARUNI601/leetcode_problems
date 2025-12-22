class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int g=n+m;
        int arr[]=new int[g];
        int k=0;
        for(int i=0;i<n;i++)
        {
            arr[k]=nums1[i];
            k++;
        }
        for(int j=0;j<m;j++)
        {
            arr[k]=nums2[j];
            k++;
        }
        Arrays.sort(arr);
        if(g%2==0)
        {
            return (float)(arr[(g/2)-1]+arr[g/2])/2;
        }
        else
        {
            return arr[g/2];
        }
    }
}