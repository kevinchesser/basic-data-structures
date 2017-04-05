package ctci;

public class Main {

	public static void main(String[] args){
		treeTest();
	}
	
	public static void treeTest(){
		Tree tree = new Tree();
		tree.add(9);
		tree.add(17);
		tree.add(90);
		tree.add(3);
		tree.add(4);
		tree.add(7);
		tree.add(18);
		tree.add(12);
		tree.add(12);
		tree.traverse(1);
	}
	
	
}
