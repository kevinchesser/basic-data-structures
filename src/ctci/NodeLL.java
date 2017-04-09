package ctci;

public class NodeLL {
	
	private int data;
	private NodeLL next;
	
	public NodeLL(int data, NodeLL next){
		this.data = data;
		this.next = next;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setNext(NodeLL next){
		this.next = next;
	}
	
	public int getData(){
		return this.data;
	}
	
	public NodeLL getNext(){
		return this.next;
	}

}
