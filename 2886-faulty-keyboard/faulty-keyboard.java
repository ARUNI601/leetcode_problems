class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            Character ch = s.charAt(i);
            if(ch=='i')
            {
                sb.reverse();
            }
            else
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}