class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int s=0;
        int lower = (purchaseAmount / 10) * 10;
        int upper = lower + 10;
        int l=purchaseAmount-lower;;
        int u=upper-purchaseAmount;
        if(l>=5)
        {
            s=100-upper;
        }
        else if(purchaseAmount%10==0)
        {
            s=100-purchaseAmount;
        }
        else
        {
            s=100-lower;
        }
        return s;
    }
}