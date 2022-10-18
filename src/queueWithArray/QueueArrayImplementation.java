package queueWithArray;

/**
 * 
 * @author teddy
 *
 */

public class QueueArrayImplementation {
	private int front;
	private int rear;
	private int size;
	private String[] arr;
	
	public QueueArrayImplementation() {
		this.front  = 0;
		this.rear = 0;
		this.size = 0;
		this.arr = new String[4];
		
	}
	
	
	public void enqueue(String element) {
		if(element==null)
			return;
		if(rear==size) 
			resize();
		arr[rear] = element;
		rear++;
		size++;		
			
	}
	
	public String dequeue() {
		if(isEmpty()) {
			System.out.println("Empty");
			return null;
		}
		
		String temp = arr[front];
		front++;
		size--;
		return temp;		
		
	}
	
	public boolean isEmpty() {
		return(front==rear);
	}
	
	public int size() {
		return size;
	}
	
	public void resize() {
		String[] tempArr = new String[2*arr.length];

		System.arraycopy(arr, 0, tempArr, 0, size);
		
		arr = tempArr;
		
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Empty");
		}
		
		for(int i=front; i<rear; i++) {
			System.out.print(arr[i]+' ');
		}
		System.out.println();
	}
	
	
}