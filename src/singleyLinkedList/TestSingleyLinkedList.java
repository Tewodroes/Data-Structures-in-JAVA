package singleyLinkedList;

/**
 * 
 * @author teddy
 *
 */

public class TestSingleyLinkedList {

	
	public static void main(String[] args) {
		
		SingleyLinkedList sll = new SingleyLinkedList();
		
		sll.add(6);
		sll.add(8);
		sll.add(66);
		sll.add(77);
		sll.display();
		
		System.out.println(sll.getLastNode());
		System.out.println(sll.search(60));

	}

}
