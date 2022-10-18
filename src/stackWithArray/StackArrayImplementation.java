package stackWithArray;

/**
 * 
 * @author teddy
 *
 */

public class StackArrayImplementation {
	
	int top;
	int capacity;
	int[] stack;
	
	public StackArrayImplementation(int capacity) {
		top = -1;		
		this.capacity = capacity;
		stack = new int[capacity];
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("Stack is empty");
		for(int i=top; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(top == capacity-1)
			return true;
		else
			return false;
	}
	
	public void push(int n) {
		if(isFull())
			System.out.println("Stack is full");
		else {
			top++;
			stack[top] = n;
		}
	}
	
	public void pop() {
		if(isEmpty())
			System.out.println("Stack is Empty");
		else {
			System.out.println(stack[top]+" is popped");
			top--;
		}
	}
	
	public void peek() {
		if(isEmpty()) 
			System.out.println("Stack is Empty");
		else
			System.out.println(stack[top]);
		
	}

}
