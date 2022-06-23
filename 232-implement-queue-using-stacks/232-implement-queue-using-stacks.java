class MyQueue {
    Stack<Integer> addS = new Stack<>();
    Stack<Integer> removeS = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        addS.push(x);  
    
        
    }
    
    private void moveElements() {
        if(removeS.isEmpty()) {
            while(!addS.isEmpty()) {
                removeS.add(addS.pop());
            }
        }
       
      
    }
    
    public int pop() {
        moveElements();
        return removeS.pop();
        
    }
    
    public int peek() {
       
            moveElements();
        
        return removeS.peek();
        
    }
    
    public boolean empty() {
        return addS.empty() && removeS.empty();
    }
    
 
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */