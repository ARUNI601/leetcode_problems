class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        int l=nums.size();
        for(int i=0;i<l-1;i++){
            int a=nums.get(i);
            for(int j=i+1;j<l;j++){
                int b=nums.get(j);
                if(a+b<target){
                            c++;
                }
            }
        }
        return c;
    }
}