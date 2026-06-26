class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int n=0,i=0,j=i+2;
        boolean t=false;
        char[] charArray = s1.toCharArray();
        while(i<4)
        {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            n++;
            i++;
            j++;
            String s3=new String(charArray);
            t=s3.toString().equals(s2);
            if(t)
            {
                return true;
            }
            if(j==4)
            {
                j=0;
            }
        }
        return t;
    }
}