class StockSpanner {

    int[] prices = new int[10000];
    int[] spans = new int[10000];
    int top = -1;

    public StockSpanner() {
    }

    public int next(int price) {

        int span = 1;

        while (top >= 0 && prices[top] <= price) {
            span += spans[top];
            top--;
        }

        top++;

        prices[top] = price;
        spans[top] = span;

        return span;
    }
}