import java.util.Arrays;

public class SelectionSort {

	public void sort(int[] array){
		int temp;
		for(int i = 0;i < array.length; i++){
			for(int j = i + 1; j < array.length; j++){
				if(array[i] > array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println(Arrays.toString(array));
		}
//		System.out.println(Arrays.toString(array));
	}
}

