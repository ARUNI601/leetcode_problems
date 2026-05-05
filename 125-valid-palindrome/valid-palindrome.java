class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String result="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                result+=ch;
            }
        }
        return result.equals(new StringBuilder(result).reverse().toString());
        
    }
}