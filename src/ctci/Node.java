package ctci;

public class Node {

	private Node left;
	private Node right;
	private Node parent;
	private int data;
	private int count;
	
	public Node(Node left, Node right, Node parent, int data, int count){
		this.left = left;
		this.right = right;
		this.parent = parent;
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
	
	public Node getParent(){
		return this.parent;
	}
	
	public void setParent(Node parent){
		this.parent = parent;
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
