class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=piles.length;
        int max = Arrays.stream(piles).max().getAsInt();
        int low=1,high=max,mid=0;
        int hour=0;
        while(low<high)
        {
            hour=0;
            mid=(low+high)/2;
            for(int i=0;i<l;i++)
            {
                hour=hour+(piles[i]+mid-1)/mid;
            }
            if(hour<=h)
            {
                high=mid;
            }
            else if(hour>h)
            {
                low=mid+1;
            }
        }
        return low;
    }
}