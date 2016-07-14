/*
 * Heapsort.c
 *
 */
#include <stdio.h>
#include <stdlib.h>

struct MaxHeap{
	int size;
	int *array;
};

void swap(int* a, int* b){
	int t = *a;
	*a = *b;
	*b = t;
}

void maxHeapify(struct MaxHeap* MaxHeap, int i){
	int largest = i;
	int left = (i << 1) + 1;
	int right = (i + 1) << 1;

	if(left < MaxHeap->size && MaxHeap->array[left] > MaxHeap->array[largest]){
		largest = left;
	}
	if(right < MaxHeap->size && MaxHeap->array[right] > MaxHeap->array[largest]){
		largest = right;
	}

	if(largest != i){
		swap(&MaxHeap->array[largest], &MaxHeap->array[i]);
		maxHeapify(MaxHeap,largest);
	}
}

struct MaxHeap* createAndBuildHeap(int *array, int size){
	int i;
	struct MaxHeap* maxHeap = (struct MaxHeap*) malloc(sizeof(struct MaxHeap));
	maxHeap->size = size;
	maxHeap->array = array;

	for(i = (maxHeap->size - 2)/2; i>= 0; --i){
		maxHeapify(maxHeap, i);
	}
	return maxHeap;
}

void heapSort(int* array, int size){
	struct MaxHeap* maxHeap = createAndBuildHeap(array, size);

	while(maxHeap->size > 1){
		swap(&maxHeap->array[0], &maxHeap->array[maxHeap->size - 1]);
		--maxHeap->size;
		maxHeapify(maxHeap, 0);
	}
}

void printArray(int* array, int size){
	for(int i = 0; i < size; ++i)
		printf("%d ",array[i]);
}

int main(){
	int array[] = {12, 11, 13, 5, 6, 7};
	int size = sizeof(array)/sizeof(array[0]);
	heapSort(array, size);
	printf("The sorted array is ");
	printArray(array, size);
}


