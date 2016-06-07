
public class TestAlgorithims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {3,8,1,9,4,5,3};

		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();
		InsertionSort insertionSort = new InsertionSort();
//		bubbleSort.sort(array);
//		selectionSort.sort(array);
		insertionSort.sort(array);
	}

}
