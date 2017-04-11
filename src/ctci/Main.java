package ctci;

import java.util.Random;
import java.util.Arrays;

public class Main {

	public static void main(String[] args){
		//treeTest();
		//sortTest();
		//linkedListTest();
		//queueTest();
		stackTest();
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
		//linkedList.traverse();
		linkedList.reverse();
		linkedList.traverse();
		linkedList.delete(10);
		linkedList.traverse();
	}
	
	public static void queueTest(){
		Queue queue = new Queue();
		queue.enqueue(8);
		queue.enqueue(5);
		queue.enqueue(19);
		queue.traverse();
		queue.dequeue();
		queue.traverse();
		queue.dequeue();
		queue.dequeue();
		queue.traverse();
		queue.enqueue(72);
		queue.traverse();
	}
	
	public static void stackTest(){
		Stack stack = new Stack();
		stack.push(6);
		stack.push(19);
		stack.push(7);
		stack.push(62);
		stack.push(88);
		stack.push(64);
		stack.push(5);
		stack.push(6);
		stack.push(3);
		stack.traverse();
	}
}
