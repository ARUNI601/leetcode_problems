class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer>s=new HashSet<>();
            for(int x:nums1){
                s.add(x);
            }
            Set<Integer>s2=new HashSet<>();
            for(int y:nums2){
                if(s.contains(y)){
                    s2.add(y);
                }
            }
            int res[]=new int[s2.size()];
            int i=0;
            for(int val:s2){
                res[i]=val;
                i++;
            }
            return res;
    }
}