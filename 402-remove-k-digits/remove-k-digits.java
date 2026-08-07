class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder(num);
        int l=num.length();
        if(l==k)
        {
            return "0";
        }
        int i=0,j=i+1;
        while(k>0 && j<sb.length())
        {
            if(sb.charAt(i)>sb.charAt(j))
            {
                sb.deleteCharAt(i);
                k--;
                if(i>0)
                {
                    i--;
                }
                j=i+1;
            }
            else
            {
                i++;
                j++;
            }
        }
        while (k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }
        int start = 0;
        while (start < sb.length() && sb.charAt(start) == '0') {
            start++;
        }
        if (start == sb.length()) {
            return "0";
        }
        return sb.substring(start);
    }
}