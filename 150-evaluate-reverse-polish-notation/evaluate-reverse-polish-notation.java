class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack=new int[tokens.length];
        int top=0;
        for(int i=0;i<tokens.length;i++)
        {
            String t=tokens[i];
            if(t.equals("+"))
            {
                int b=stack[top-1];
                int a=stack[top-2];
                stack[top-2]=a+b;
                top--;
            }
            else if(t.equals("-"))
            {
                int b=stack[top-1];
                int a=stack[top-2];
                stack[top-2]=a-b;
                top--;
            }
            else if(t.equals("*"))
            {
                int b=stack[top-1];
                int a=stack[top-2];
                stack[top-2]=a*b;
                top--;
            }
            else if(t.equals("/"))
            {
                int b=stack[top-1];
                int a=stack[top-2];
                stack[top-2]=a/b;
                top--;
            }
            else
            {
                stack[top]=Integer.parseInt(t);
                top++;
            }
        }
        return stack[0];
    }
}