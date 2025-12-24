class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            list.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++)
        {
            if(list.contains(nums2[j]))
            {
                list2.add(nums2[j]);
                list.remove(Integer.valueOf(nums2[j]));
            }
        }
        int[] answer=new int[list2.size()];
        for(int i=0;i<list2.size();i++)
        {
            answer[i]=list2.get(i);
        }
        return answer;
    }
}