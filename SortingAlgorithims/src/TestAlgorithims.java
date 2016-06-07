
public class TestAlgorithims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bubbleArray[] = {3,8,1,9,4,5,3};
		int selectionArray[] = {11,0,1,7,4,2,3};
		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();
		bubbleSort.sort(bubbleArray);
		selectionSort.sort(selectionArray);
	}

}
