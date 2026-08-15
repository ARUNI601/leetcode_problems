class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 2 * n; i++) {
            int cur = i % n; 
            while (!st.isEmpty() && nums[st.peek()] < nums[cur]) {
                int k= st.pop(); 
                ans[k] = nums[cur];
            }
            if (i < n) {
                st.push(cur);
            }
        }
        return ans;
    }
}