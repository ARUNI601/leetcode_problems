class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int l=candies.length;
        List<Boolean> arr = new ArrayList<>(l);
        int max=candies[0];
        for(int i=1;i<l;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
        for(int j=0;j<l;j++)
        {
            if(candies[j]+extraCandies>=max)
            {
                arr.add(true);
            }
            else
            {
                arr.add(false);
            }
        }
        return arr;
    }
}