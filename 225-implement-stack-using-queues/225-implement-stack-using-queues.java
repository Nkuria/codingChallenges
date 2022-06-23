class MyStack {
    
    Queue<Integer> adder = new LinkedList<>();
    

    public MyStack() {
        
    }
    
    public void push(int x) {
        adder.add(x);
        for(int i = 0; i < adder.size() -1; i++) {
            adder.add(adder.remove());
        }
    }
    
    
    public int pop() {
        return adder.remove();
        
    }
    
    public int top() {

        return adder.peek();
        
    }
    
    public boolean empty() {
        return adder.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */