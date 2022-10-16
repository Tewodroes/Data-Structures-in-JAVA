package arrayList;

/**
 * 
 * @author teddy
 *
 */

public class MyArrayList {
	int size;
	String[] arr;

	public MyArrayList() {
		final int INITIAL_LENGTH = 4;
		size = 0;
		arr = new String[INITIAL_LENGTH];
	}
	

	public boolean isEmpty() {
		return (size == 0);
	}

	public void add(String str) {
		if (size >= arr.length - 1)
			resize();
		arr[size] = str;
		size++;
	}

	public int find(String str) {
		int index = -1;
		if (str == null)
			return -1;
		else {
			for (int i = 0; i < size; i++) {
				if (arr[i].equals(str))
					index = i;
			}
		}
		return index;
	}

	public void removeLast() {
		if (isEmpty())
			System.out.println("Array List is Empty");
		else {
			arr[size] = null;
			size--;
		}
	}

	public void removeByValue(String str) {
		if (isEmpty() || find(str) == -1)
			System.out.println(str + " not found");
		else {
			int index = find(str);
			String[] tempArray = new String[size];
			System.arraycopy(arr, 0, tempArray, 0, index);
			System.arraycopy(arr, index + 1, tempArray, index, size - (index + 1));

			arr = tempArray;
			size--;
		}

	}

	public void insert(String str, int index) {

		if (index < 0 || index > size)
			System.out.println("Index Out of Bound");

		else {
			if (size >= arr.length - 1)
				resize();

			String[] tempArr = new String[size + 1];
			System.arraycopy(arr, 0, tempArr, 0, index);
			tempArr[index] = str;
			display();
			System.arraycopy(arr, index, tempArr, index + 1, size - index);

			arr = tempArr;
			size++;

		}

	}

	public void resize() {
		String[] tempArray = new String[2 * arr.length];

		System.arraycopy(arr, 0, tempArray, 0, size);

		arr = tempArray;
	}

	public void display() {
		if (size == 0)
			System.out.println("Array List is Empty");
		else if (size == 1)
			System.out.println(arr[size]);
		else {
			System.out.print("[" + arr[0] + ", ");
			for (int i = 1; i < size - 1; i++) {
				System.out.print(arr[i] + ", ");
			}
			System.out.print(arr[size - 1] + "]\n");
		}
	}

}
