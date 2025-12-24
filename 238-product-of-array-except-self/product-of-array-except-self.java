class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int p =1;
        int po[] = new int[n];
        for(int i=0; i <n ; i++)
        {
          p = p* nums[i];
          po[i] = p;
        }
        p=1;
        for(int i =n-1; i >0;i--)
        {
            po[i]=p*po[i-1];
            p=p*nums[i];
        }
        po[0]=p;
        return po;
        
    }
}
