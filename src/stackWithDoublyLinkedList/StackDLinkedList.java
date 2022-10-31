package stackWithDoublyLinkedList;

/**
 * 
 * @author teddy
 *
 */

public class StackDLinkedList {
	
	class Node{
		Node prev;
		Node next;
		String data;
		
		Node(Node prev, String data, Node next){
			this.prev = prev;
			this.data = data;
			this.next = next;
		}	
		
	}
	
	Node top;
	int size;
	
	public StackDLinkedList() {
		top = null;
		size = 0;
	}
	
	public void push(String data) {
		
		Node newNode = new Node(null, data, top);
		
		if(size==0) {
			top = newNode;
		}
		
		else {			
			top.prev = newNode;
			top = newNode;			
		}
		size++;
	}
	
	public String pop() {
		if(size==0)
			return null;		
		String temp = top.data;
		//top.next.prev = null;
		top = top.next;
		
		size--;
		return temp;
		
	}
	
	public String peek() {
		if(size==0)
			return null;
		else
			return top.data;
	}
	
	
	public boolean isEmpty() {
		return(size==0);
	}
	
	public int size() {
		return size;
	}
	
	public void display() {
		if(size==0)
			System.out.println("Empty");
		Node temp = top;
		while(temp!=null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		StackDLinkedList st = new StackDLinkedList();
		
		st.push("Simegnew");
		st.push("Tewodros");
		st.push("Ayalneh");
		
		st.display();
		System.out.println(st.pop());
		st.display();
		System.out.println("Size: "+st.size());
		System.out.println("Peeked: "+ st.peek());
		st.display();
		
		
		
		
	}

}
