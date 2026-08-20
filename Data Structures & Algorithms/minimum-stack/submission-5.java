class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private int min = 0;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
            return;
        }
        if(val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        //System.out.print(minStack);
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();


    }
}
