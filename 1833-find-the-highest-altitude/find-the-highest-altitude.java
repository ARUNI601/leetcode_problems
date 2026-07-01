class Solution {
    public int largestAltitude(int[] gain) {
        int l=gain.length;
        int arr[]=new int[l+1];
        arr[0]=0;
        int max=arr[0];
        for(int i=0;i<l;i++)
        {
            arr[i+1]=arr[i]+gain[i];
            if(max<arr[i+1])
            {
                max=arr[i+1];
            }
        }
        return max;
    }
}