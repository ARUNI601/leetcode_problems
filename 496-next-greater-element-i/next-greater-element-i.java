class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        st.push(nums2[0]);
        for(int i=1;i<nums2.length;i++)
        {
            while(!st.isEmpty() && st.peek()<nums2[i])
            {
                map.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        for(int j=0;j<nums1.length;j++)
        {
            ans[j]=map.getOrDefault(nums1[j],-1);
        }
        return ans;
    }
}