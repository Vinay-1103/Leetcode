class MinStack {

    Stack<Long> mainStack;
    long min;

    public MinStack() {
        mainStack = new Stack<>();
    }
    
    public void push(int val) {
        if(mainStack.isEmpty()){
            mainStack.push((long)val);
            min = val;
        }
        else if(val < min){
            long newVal=2L*val - min;
            mainStack.push(newVal);
            min=val;
        }
        else{
            mainStack.push((long)val);
        }
    }
    
    public void pop() {
        if(mainStack.peek() < min){
            min = 2*min - mainStack.peek();
        }
        mainStack.pop();
    }
    
    public int top() {
        if(mainStack.peek() < min){
            return (int)min;
        }
        return (int)(long)mainStack.peek();
    }
    
    public int getMin() {
        return (int)min;
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