package doubleyLinkedList;

/**
 * 
 * @author teddy
 *
 */

public class DoubleyLinkedList {
	
	Node header; 
	
	public DoubleyLinkedList() {
		
		header = new Node(null, 0, null); // Instantiate a header with this default values;
	
	}	
	
	// An inner class to create a node.
	class Node{		
		Node prev;
		int value;
		Node next;
		
		Node(Node prev, int value, Node next){
			this.prev = prev;
			this.value = value;
			this.next = next;
		}
		
		
	}
	
	
	public void addFirst(int n) {
		
		Node newNode = new Node(header, n, header.next);
		Node current = header.next;
		
		if(current==null) 
			header.next= newNode;
			
		else {
			header.next.prev = newNode;
			header.next = newNode;			
		}
		
		/** Same like the above one
		if(header.next!=null)
			header.next.prev = newNode;
		header.next = newNode;		*/
		
		
	}
	
	
	public void display() {
		Node current = header.next;
		while(current!=null) {
			System.out.print(current.value+" ");
			current =current.next;
		}
		
	}
	
	public int size() {
		
		int count = 0;
		Node current = header.next;
		while(current != null) {
			count++;
			current =current.next;
		}
		
		return count;
	}
	
	
	public boolean find(int n) {
		
		Node current = header.next;
		
		while(current != null) {
			if(current.value==n)
				return true;
			current = current.next;
		}
		
		return false;
		
	}
	
	public int findFirstIndex(int n) {
		
		int index = -1;
		Node current = header.next;
		
		while(current != null) {
			index++;
			if(current.value==n) 
				return index;
			
			current = current.next;
		}
		
		return index;
	}
	
	
	
	
	
	
	

}
