class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<nums1.length;i++) 
        {
            mp.put(nums1[i], mp.getOrDefault(nums1[i], 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int j=0;j<nums2.length;j++) 
        {
            if (mp.containsKey(nums2[j]) && mp.get(nums2[j]) > 0) {
                result.add(nums2[j]);
                mp.put(nums2[j], mp.get(nums2[j]) - 1);
            }
        }
        int[] answer=new int[result.size()];
        for(int k=0;k<result.size();k++)
        {
            answer[k]=result.get(k);
        }
        return answer;
    }
}