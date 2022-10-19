package queueWithLinkedlist;

/**
 * 
 * @author teddy
 *
 */

public class QueueLinkedListImplmentation {
	
	public class Node {		
		int data;
		Node next;		
		
	}
	
	Node front;
	Node rear;
	
	
	public QueueLinkedListImplmentation() {
		Node front = null;
		Node rear = null;
	}
	
	public boolean isEmpty() {
		return (front==null);
	}
	
	public void enqueue(int value) {
		if(isEmpty()) {
			Node newNode = new Node();
			newNode.data = value;
			front = newNode;
			rear = newNode;
		}
		
		else {
			Node newNode = new Node();
			newNode.data = value;	
			
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public void dequeue() {
		if(isEmpty()){
			System.out.println("Queue is empty!");
		}
		
		else {
			System.out.println(front.data+" is dequeued");
			front = front.next;
		}
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("Queue is empty");
		Node temp = front;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

}
