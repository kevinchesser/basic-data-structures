package ctci;

import java.util.Random;

public class Sort {

	public Sort(){
	}
	
	public int[] bubbleSort(int[] array){
		boolean noSwaps = false;
		while(noSwaps == false){
			int swaps = 0;
			for(int i = 0; i < array.length; i++){
				if(i+1 < array.length && array[i] > array[i+1]){
					int temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
					swaps++;
				}
			}
			if(swaps == 0){
				noSwaps = true;
			}
		}
		return array;
	}
	
	public int[] selectionSort(int[] array){
		for(int i = 0; i < array.length; i++){
			int smallestIndex = i;
			for(int j = i + 1; j < array.length; j++){
				if(array[j] < array[smallestIndex]){
					smallestIndex = j;
				}
			}
			int temp = array[i];
			array[i] = array[smallestIndex];
			array[smallestIndex] = temp;
		}
		return array;
	}
	
	public int[] mergeSort(int[] array){

		return array;
	}
	
	public int[] randomArray(){
		Random r = new Random();
		int[] arr = new int[1000];
		for(int i = 0; i < arr.length; i++){
			arr[i] = r.nextInt(1000);
		}
		return arr;
	}
	
}
