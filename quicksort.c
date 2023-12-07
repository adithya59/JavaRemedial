#include <stdio.h>

int size;
	
int Partition(int array[10],int ub,int lb) {
	int start=lb, end=ub, pivot=array[lb];
	while(start<end) {
		while (array[start]<=pivot && start<size) {
			start++;
		}
		while (array[end]>=pivot) {
			end--;
		}
		if (start<end) {
			array[start]=array[start]+array[end];
			array[end]=array[start]-array[end];
			array[start]=array[start]-array[end];
		}
	}
	array[lb]=array[lb]+array[end];
	array[end]=array[lb]-array[end];
	array[lb]=array[lb]-array[end];
	return end;
}

void quicksort(int array[10],int ub,int lb) {
	if(lb<ub) {
		int key=Partition(array,ub,lb);
		quicksort(array,key-1,lb);
		quicksort(array,ub,key+1);
	}
}

void main() {
	printf("Enter size of the array:");
	scanf("%d",&size);
	int array[size];
	printf("Enter the elements of the array:");
	for (int i=0;i<size;i++) {
		scanf("%d",&array[i]);
	}
	quicksort(array,(size-1),0);
	for (int i=0;i<size;i++) {
		printf("%d",array[i]);
	}
}
