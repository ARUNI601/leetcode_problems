class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int r=mat.length;
        int j=0,k=r-1;
        for(int i=0;i<r;i++)
        {
            sum=sum+mat[i][j]+mat[i][k];
            j++;
            k--;
        }
        if(r%2==1)
        {
            sum=sum-mat[r/2][r/2];
        }    
        return sum;
    }
}