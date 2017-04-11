package ctci;

public class NodeS {

	private int data;
	private NodeS next;
	private NodeS prev;
	
	public NodeS(int data, NodeS next, NodeS prev){
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setNext(NodeS next){
		this.next = next;
	}
	
	public void setPrev(NodeS prev){
		this.prev = prev;
	}
	
	public int getData(){
		return this.data;
	}
	
	public NodeS getNext(){
		return this.next;
	}
	
	public NodeS getPrev(){
		return this.prev;
	}

	
}
