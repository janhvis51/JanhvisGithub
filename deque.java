import java.util.* ;
import java.io.*; 
public class Deque 
{
     int front=-1;
     int rear=-1;// Initialize your data structure.
          int q[];  // Write your code here.
          int size;

    public Deque(int n) 
    {
    q = new int [n];
    size = n;
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) 
    {
     
        if(isFull())
       return false;
    else if(front==-1)
    {
        front=0;
        rear=0;
        q[front]=x;
        return true;
    }
    else{
        front = (front - 1)%size;
        if(front < 0)
          front += size;
        q[front]=x;
        return false;
    }   // Write your code here.
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        if(isFull())
        return false;
        rear+=1;
     q[rear]=x;
     if(front==-1)
     front=0;
     return true;
        // Write your code here.
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        
        if(isEmpty())
        return -1;
       int x=q[front];
        front = (front + 1)%size;
        if(front < 0)
          front += size;
        return x;// Write your code here.
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        if(isEmpty())
        return -1;
       int x=q[rear];
        rear--;
        return x;
         // Write your code here.
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
         if(!isEmpty())
       return q[front];
       return -1;// Write your code here.
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
      if(!isEmpty())
       return q[rear];
       return -1;  // Write your code here.
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
       if(front==-1&&rear==-1)
        return true;
      return false;// Write your code here.
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        if((rear+1)%size==front)
      return true;
      return false; // Write your code here.
    }
}
