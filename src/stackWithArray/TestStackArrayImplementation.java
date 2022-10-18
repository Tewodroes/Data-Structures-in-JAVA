package stackWithArray;

/**
 * 
 * @author teddy
 *
 */

public class TestStackArrayImplementation {

	public static void main(String[] args) {
		
		StackArrayImplementation st = new StackArrayImplementation(10);
		
		st.push(5);
		st.push(3);
		st.push(20);
		st.push(10);
		
		st.display();
		
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.peek();

	}

}
