class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(strs[0]);
        if (strs == null || strs.length == 0) return "";
        for(int i=1;i<strs.length;i++)
        {
            int minLength = Math.min(sb.length(), strs[i].length());
            int j;
            for(j=0;j<minLength;j++)
            {
                if(sb.charAt(j)!=strs[i].charAt(j))
                {
                    break;
                }
            }
            sb.setLength(j);
        }
        
        return sb.toString();
    }
}