class MinStack {

    Stack<Integer> s ;
    Stack<Integer> minStack;
    
    public MinStack() {
        s = new Stack<Integer>();  
        minStack = new Stack<Integer>();  
    }
    
    public void push(int val) {
        s.push(val);

        if(minStack.isEmpty()) {
            minStack.push(val);
        }else if(val < minStack.peek()) {
            minStack.push(val);
        }else {
            int min = minStack.peek();
            minStack.push(min);
        }
    }
    
    public void pop() {
        s.pop();
        minStack.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
