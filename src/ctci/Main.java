package ctci;

import java.util.Random;
import java.util.Arrays;

public class Main {

	public static void main(String[] args){
		//treeTest();
		//sortTest();
		linkedListTest();
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
		Sort sort = new Sort();
		System.out.println(Arrays.toString(sort.bubbleSort(sort.randomArray())));
		System.out.println(Arrays.toString(sort.selectionSort(sort.randomArray())));
	}
	
	public static void linkedListTest(){
		LinkedList linkedList = new LinkedList();
		linkedList.addHead(3);
		linkedList.addHead(6);
		linkedList.addTail(10);
		linkedList.traverse();
		linkedList.reverse();
		linkedList.traverse();
	}
	
	
}
