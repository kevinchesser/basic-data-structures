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
	
	public void pop(){
		if(this.top == null){
			return;
		} else if(this.top.getPrev() == null){
			this.top = null;
			return;
		} else{
			this.top = this.top.getPrev();
			this.top.setNext(null);
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
