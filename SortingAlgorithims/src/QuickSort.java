
public class QuickSort {

	public void sort(int[] array, int low, int high, boolean pivFirst){
		//
		if(low < high){
			/* array[partitionIndex] will be placed in correct position */
			if(pivFirst){
				int partitionIndex = partitionPivFirst(array, low, high);		
				//Recursively sort sides of the array
				sort(array, low, partitionIndex - 1, pivFirst);
				sort(array, partitionIndex + 1, high, pivFirst);
				
			}else{
				int partitionIndex = partitionPivLast(array, low, high);
				//Recursively sort sides of the array
				sort(array, low, partitionIndex - 1, !pivFirst);
				sort(array, partitionIndex + 1, high, !pivFirst);
			}
		}
		 for (int i = 0; i < array.length; i++){
		    System.out.printf("%d ", array[i]);
		 }
		    System.out.printf("\n");
	}
	
	public int partitionPivFirst(int[] array, int low, int high){
		// Pivot VALUE is the first element in array
		int pivot = array[low];
		
		/* Set up left and right marks which 
		 * progress through the array */
		int leftmark = low + 1;
		int rightmark = high;
		boolean done = false;
		while(!done){
			/* While the leftmark is less than the rightmark
			 * and the left value is less than or equal the pivot value 
			 * then we can increment the leftmark */
			while(leftmark <= rightmark && array[leftmark] <= pivot){
				leftmark += 1;
			}
			/* While the rightmark is greater than the leftmark
			 * and the right value is greater than or equal to the pivot value
			 * then we can decrement the rightmark */
			while(rightmark >= leftmark && array[rightmark] >= pivot){
				rightmark -= 1;
			}
			
			/* When the right and leftmarks have crossed 
			 * we can stop the loop because both sides are complete*/
			if(rightmark < leftmark){
				done = true;
			}
			/* The leftmark and rightmark values need to be swapped
			 * because the left value is greater than the pivot value and right
			 * value is less than the pivot value*/
			else{
				int temp = array[leftmark];
				array[leftmark] = array[rightmark];
				array[rightmark] = temp;
			}
		}
		/* Place the pivot value in the correct spot 
		 * between the two halves and return the index 
		 * where the pivot was so it can be used for recursion*/
		int temp = array[rightmark];
		array[rightmark] = array[low];
		array[low] = temp;		
		return rightmark;
	}
	
	public int partitionPivLast(int[] array, int low, int high){
		int pivot = array[high];
		int i = (low - 1);
		for(int j = low; j <= high - 1; j++){
			if(array[j] <= pivot){
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		
		return i + 1;
	}
}
