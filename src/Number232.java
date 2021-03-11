
import java.util.Stack;
public class Number232 {
	private Stack <Integer> stack;
    private Stack <Integer> stack_two;
    
    //https://www.youtube.com/watch?v=G-xV4m6G2C8
    //Youtube

    /** Initialize your data structure here. */
    public Number232() {
        this.stack=new Stack<>();
        this.stack_two=new Stack<>();
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        
      stack.push(x);
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!stack.isEmpty()){
           int temp=stack.pop();
           stack_two.push(temp);
        }
      
        return stack_two.pop();
        
    }
    
    /** Get the front element. */
    public int peek() {
        
        return stack_two.peek();
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack_two.isEmpty();
        
    }

}
