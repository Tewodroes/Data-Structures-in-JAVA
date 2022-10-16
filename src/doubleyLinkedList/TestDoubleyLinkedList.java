package doubleyLinkedList;

/**
 * 
 * @author teddy
 *
 */

public class TestDoubleyLinkedList {

	public static void main(String[] args) {
		
		DoubleyLinkedList dll = new DoubleyLinkedList();
		
		dll.addFirst(6);
		dll.addFirst(5);
		dll.addFirst(8);
		dll.addFirst(5);
		dll.addFirst(8);	
		
		
		
		dll.display();
		
		System.out.println("\nSize: "+dll.size());
		System.out.println(dll.find(50));
		System.out.println("Index: "+dll.findFirstIndex(5));

	}

}
