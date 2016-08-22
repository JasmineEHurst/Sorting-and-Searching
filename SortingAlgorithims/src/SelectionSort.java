import java.util.Arrays;

public class SelectionSort {

	public void sort(int[] array){
		int minimum;
		for(int i = 0;i < array.length; i++){
			for(int j = i + 1; j < array.length; j++){
				if(array[i] > array[j]){
					minimum = array[i];
					array[i] = array[j];
					array[j] = minimum;
				}
			}
			System.out.println(Arrays.toString(array));
		}
//		System.out.println(Arrays.toString(array));
	}
}

