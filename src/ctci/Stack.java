package ctci;

public class Stack {

	private NodeS top;
	
	public Stack(){
		this.top = null;
	}
	
	public void push(int data){
		NodeS node = new NodeS(data, null, null);
		if(this.top == null){
			this.top = node;
		} else{
			this.top.setNext(node);
			node.setPrev(this.top);
			this.top = node;
		}
	}
	
	public void traverse(){
		NodeS node = this.top;
		while(node != null){
			System.out.println(node.getData());
			node = node.getPrev();
		}
	}
}
