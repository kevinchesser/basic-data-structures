package ctci;

public class Node {

	private Node left;
	private Node right;
	private int data;
	private int count;
	
	public Node(Node left, Node right, int data, int count){
		this.left = left;
		this.right = right;
		this.data = data;
		this.count = count;
	}

	public Node getLeft(){
		return this.left;
	}

	public void setLeft(Node left){
		this.left = left;
	}

	public Node getRight(){
		return this.right;
	}

	public void setRight(Node right){
		this.right = right;
	}

	public int getData(){
		return this.data;
	}

	public void setData(int data){
		this.data = data;
	}
	
	public int getCount(){
		return this.count;
	}
	
	public void setCount(int count){
		this.count = count;
	}
	
	
}
