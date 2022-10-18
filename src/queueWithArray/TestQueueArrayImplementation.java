package queueWithArray;

/**
 * 
 * @author teddy
 *
 */

public class TestQueueArrayImplementation {

	public static void main(String[] args) {
		QueueArrayImplementation qi = new QueueArrayImplementation();
		
		
		
		qi.enqueue("Teddy");
		qi.enqueue("Amen");
		//System.out.println(qi.isFull());
		qi.enqueue("Zola");
		qi.enqueue("Mahi");
		qi.enqueue("Ayalneh");
		qi.display();
		System.out.println("Size: "+qi.size());
		qi.dequeue();
		qi.display();
		
		qi.dequeue();
		qi.display();
		
		qi.dequeue();
		qi.display();
		
		qi.dequeue();
		qi.dequeue();
	
		
		
		

	}

}
