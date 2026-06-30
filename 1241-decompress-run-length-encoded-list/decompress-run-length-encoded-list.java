class Solution {
    public int[] decompressRLElist(int[] nums) {
        int k=0;
        int h=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i=i+2)
        {
            k=nums[i];
            h=nums[i+1];
            while(k>0)
            {
                list.add(h);
                k--;
            }

        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}