package ctci;

public class NodeQ {

	private int data;
	private NodeQ next;
	
	public NodeQ(int data, NodeQ next){
		this.data = data;
		this.next = next;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setNext(NodeQ next){
		this.next = next;
	}
	
	public int getData(){
		return this.data;
	}
	
	public NodeQ getNext(){
		return this.next;
	}

}
