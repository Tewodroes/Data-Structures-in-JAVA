package arrayList;

/**
 * 
 * @author teddy
 *
 */

public class Main {
	public static void main(String[] args) {
		MyArrayList myList = new MyArrayList();
		
		System.out.println("Is Empty ? "+myList.isEmpty());
		
		myList.add("String-1");
		myList.add("String-2");
		myList.add("String-3");
		myList.add("String-4");
		myList.add("String-5");
		
		myList.display();
		System.out.println("Is Empty ? "+myList.isEmpty());
		
		System.out.println("removeLast() ");
		myList.removeLast();
		myList.display();
	}
}
