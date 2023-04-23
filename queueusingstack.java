class MyQueue {
    int front=-1;
    int rear=-1;
   int queue[]=new int[1000];
    public MyQueue() {
        
    }
    
    public void push(int x) {
       if(empty()) {
            rear = 0;
            front = 0;
        } else {
            rear++;
        }
        queue[rear] = x;


    }
    
    public int pop() {
        if(!empty()) {
            int value = queue[front];
            front++;
            if(front > rear) {
                front = -1;
                rear = -1;
            }
            return value;
        }
        return -1;
    }
    public int peek() {
        if(!empty())
        return queue[front];
        return -1; 
        
     }
    
    public boolean empty() {
        return front==-1&&rear==-1;
         
        
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