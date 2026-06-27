class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        int p;
        for(int i=0;i<nums.length;i++)
        {
            p=encrypt(nums[i]);
            sum+=p;
        }
        return sum;
    }
    public static int encrypt(int n) 
    {
        int rem=0,k=0;
        int re=0;
        while(n>0)
        {
            re=n%10;
            n/=10;
            if(re>rem)
            {
                rem=re;
            }
            k++;
        }
        int h=rem;
        while(k>1)
        {
            h=h*10+rem;
            k--;
        }
        return h;
    }
}