/*
 
*/


package pkg18.exception.handling;
import java.util.*;

// Let's Custom exception class for stack overflow
class StackOverflowException extends Exception {
    // constructor
    public StackOverflowException(String message) {
        super(message);
    }
}

// Let's Custom exception class for stack underflow
class StackUnderflowException extends Exception {
    // constructor
    public StackUnderflowException(String message) {
        super(message);
    }
}

//
class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    
    // Constructor to initialize the stack
    public Stack (int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }
    
    
    // Method to push an element onto the stack
    public void push(int value) throws StackOverflowException{
        if(isFull()) {
            throw new StackOverflowException("Stack is full. Can not push " + value);
        }
        
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " onto the stack.");
    }
    
    // Method to pop an element from the stack
    public int pop() throws StackUnderflowException {
        if(isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Can not pop.");
        }
        
        int value = stackArray[top--];
        System.out.println("Popped " + value + " from the stack.");
        return value;
    }
    
    
    
    // Method to check if the stack isEmpty
    public boolean isEmpty() {
        return (top == -1);
    }
    
    // Method to check if the stack isFull
    public boolean isFull() {
        return (top == (maxSize-1));
    }
}


public class StudentChallengeOnUserDefinedException {
    public static void main(String[] args) {
        // Create a stack of size 5
        Stack stack = new Stack(5);
        
        // Push operation
        try {
            // Pushing elements onto the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            
            // Trying to push another element to cause overflow
            stack.push(60);
        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        }
        
        
        // Pop Operation
        try {
            // Popping elements from the stack
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            
            // Trying to pop another element to cause underflow exception
            stack.pop();
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}


/*
Output:-
----------
Pushed 10 onto the stack.
Pushed 20 onto the stack.
Pushed 30 onto the stack.
Pushed 40 onto the stack.
Pushed 50 onto the stack.
Stack is full. Can not push 60
Popped 50 from the stack.
Popped 40 from the stack.
Popped 30 from the stack.
Popped 20 from the stack.
Popped 10 from the stack.
Stack is empty. Can not pop.



*/