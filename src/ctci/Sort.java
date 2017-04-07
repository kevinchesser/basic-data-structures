package ctci;
import java.util.Arrays;

public class Sort {
	private int[] arr;

	public Sort(int[] arr){
		this.arr = arr;
	}
	
	public int[] bubbleSort(){
		int[] array = this.arr;
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
	
	
	public int[] getArr(){
		return this.arr;
	}
	
	public void setArr(int[] arr){
		this.arr = arr;
	}
	
}
