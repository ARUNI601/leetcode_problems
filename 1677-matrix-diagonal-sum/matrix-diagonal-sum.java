class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int r=mat.length;
        int j=0,k=r-1;
        if(r%2==0)
        {
            for(int i=0;i<r;i++)
            {
                sum=sum+mat[i][j]+mat[i][k];
                j++;
                k--;
            }
        }
        else
        {
            j=0;
            k=r-1;
            for(int i=0;i<r;i++)
            {
                sum=sum+mat[i][j];
                if(i!=k)
                {
                    sum=sum+mat[i][k];
                }
                j++;
                k--;
            }
        }
        return sum;
    }
}