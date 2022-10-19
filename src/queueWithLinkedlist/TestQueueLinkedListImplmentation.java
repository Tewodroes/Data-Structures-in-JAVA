package queueWithLinkedlist;

/**
 * 
 * @author teddy
 *
 */

public class TestQueueLinkedListImplmentation {

	public static void main(String[] args) {
		 
		QueueLinkedListImplmentation qi = new QueueLinkedListImplmentation();
		
		
		qi.enqueue(20);
		qi.enqueue(30);
		qi.enqueue(40);
		qi.enqueue(60);
		qi.enqueue(50);
		qi.enqueue(10);
		
		qi.display();
		qi.dequeue();
		qi.display();
		
		qi.enqueue(100);
		qi.display();
		
		qi.dequeue();
		qi.display();
		

	}

}
