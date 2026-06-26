class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int largest = 0;
            while(temp > 0) {
                int digit = temp % 10;
                if(digit > largest) {
                    largest = digit;
                }
                temp = temp / 10;
            }
            if(map.containsKey(largest)) {
                int currentSum =map.get(largest) + nums[i];
                maxSum =Math.max(maxSum, currentSum);
                map.put(largest,Math.max(map.get(largest),nums[i]));
            }
            else {
                map.put(largest, nums[i]);
            }
        }
         return maxSum;
    }
}