class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        int j=s.length()-1;
        while(j>=0)
        {
            while(j>=0 && s.charAt(j)==' ')
            {
                j--;
            }
            if(j<0)
            {
                break;
            }
            int i=j;
            while(i>=0 && s.charAt(i)!=' ')
            {
                i--;
            }
            ans.append(s.substring(i+1,j+1));
            ans.append(" ");
            j=i-1;
        }
        return ans.toString().trim();
    }
}