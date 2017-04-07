package ctci;

import java.util.Random;
import java.util.Arrays;

public class Main {

	public static void main(String[] args){
		//treeTest();
		sortTest();
	}
	
	public static void treeTest(){
		Tree tree = new Tree();
/*		tree.add(9);
		tree.add(17);
		tree.add(90);
		tree.add(3);
		tree.add(4);
		tree.add(7);
		tree.add(18);
		tree.add(12);
		tree.add(12);*/
		tree.add(20);
		tree.add(8);
		tree.add(22);
		tree.add(4);
		tree.add(12);
		tree.add(10);
		tree.add(14);
		tree.traverse(2);
		/*if(tree.find(33) != null){
			System.out.println("Found 33");
		} else{
			System.out.println("Didn't find 33");
		}
		if(tree.find(17) != null){
			System.out.println("Found 17");
		} else{
			System.out.println("Didn't find 17");
		}*/
		boolean deleted = tree.delete(9);
		System.out.println(deleted);
		tree.traverse(2);
	}
	
	
	public static void sortTest(){
		Random r = new Random();
		int[] arr = new int[1000];
		for(int i = 0; i < arr.length; i++){
			arr[i] = r.nextInt(1000);
		}
		Sort sort = new Sort(arr);
		System.out.println(Arrays.toString(sort.bubbleSort()));
	}
	
	
}
