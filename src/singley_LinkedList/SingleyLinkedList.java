package singley_LinkedList;

/**
 * 
 * @author teddy
 *
 */

public class SingleyLinkedList {
	
	class Node{
		int data;
		Node next;
		
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	Node tail = null;
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
			tail = newNode;
		}
		
		else {
			tail.next = newNode;
			tail = newNode;
		}
			
			
		
	}
	
	public int getLastNode() {
		Node temp = getLastNode(head);
		return temp.data;
	}
	
	private Node getLastNode(Node node) {
		if(node==null)
			return null;
		if(node.next==null)
			return node;
		Node temp = getLastNode(node.next);
		return temp;
		
		
		
	}
	
	public void display() {
		
		if(head==null) {
			System.out.println("Linked List is empty");
			return;
		}
		
		else {
			Node current = head;
			
			while(current!=null) {
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}
		
	}
	
	
	
	private boolean searchRec(int s, Node n) {
		if(n==null)
			return false;
		if(s == n.data)
			return true;
		return searchRec(s, n.next);			
					
	}	
	public boolean search(int s) {
		return searchRec(s, head);
	}
	
	
	
	
	
	
	
	
	public int find(int n) {
		Node current = head;
		int index = -1;
		int i = -1;;
		while(current!=null) {
			i++;
			if(current.data == n)
				index = i;
			current = current.next;
		}
		
		return index;
	}

}
