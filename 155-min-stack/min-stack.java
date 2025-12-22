class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> minst=new Stack<>();
    public void push(int val)
    {
        st.push(val);
        if(minst.isEmpty())
        {
            minst.push(val);
        }
        else if(minst.peek()>=val)
        {
            minst.push(val);
        }
    }
    public void pop()
    {
        int value= st.pop();
        if(!minst.isEmpty() && value==minst.peek()) 
        {
            minst.pop();
        }
    }
    public int top()
    {
        if(st.isEmpty())
        {
            return -1;
        }
        else
        {
            return st.peek();
        }
    }
    public int getMin()
    {
        if(minst.isEmpty())
        {
            return -1;
        }
        else
        {
            return minst.peek();
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */