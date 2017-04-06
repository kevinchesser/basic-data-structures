package ctci;

public class Main {

	public static void main(String[] args){
		treeTest();
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
		if(tree.find(33) != null){
			System.out.println("Found 33");
		} else{
			System.out.println("Didn't find 33");
		}
		if(tree.find(17) != null){
			System.out.println("Found 17");
		} else{
			System.out.println("Didn't find 17");
		}
		Node n = tree.find(12);
		n = tree.getInOrderSuccessor(n);
		System.out.println(n.getData());
	}
	
	
}
