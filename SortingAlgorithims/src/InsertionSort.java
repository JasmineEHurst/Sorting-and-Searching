import java.util.Arrays;


public class InsertionSort {

	public void sort(int[] array){
		int key;
		for(int i = 1;i < array.length; i++){
			key = array[i];
			int j = i - 1;
			/* Until an element smaller than th ekey has been found,
			 * shift the elements up*/
			while(j >= 0 && array[j] > key){
				array[j+1] = array[j];
				j--;
			}
			/* Place the key in front of the smaller element*/
			array[j+1] = key;
			System.out.println(Arrays.toString(array));
		}
	}
}
