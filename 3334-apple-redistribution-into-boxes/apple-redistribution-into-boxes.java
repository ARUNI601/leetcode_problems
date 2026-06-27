class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int s=0;
        for(int j=0;j<apple.length;j++)
        {
            s+=apple[j];
        }
        Arrays.sort(capacity);
        int sum=0;
        int t=0;
        for(int i=capacity.length-1;i>=0;i--)
        {
            t++;
            sum+=capacity[i];
            if(sum>=s)
            {
                break;
            }
        }
        return t;
    }
}