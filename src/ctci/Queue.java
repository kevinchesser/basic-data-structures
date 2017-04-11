package ctci;

public class Queue {
	
	private NodeQ first;
	private NodeQ last;
	
	public Queue(){
		this.first = null;
		this.last = null;
	}
	
	public void enqueue(int data){
		NodeQ node = new NodeQ(data, null);
		if(this.first == null){
			this.first = node;
			this.last = node;
		} else{
			this.last.setNext(node);
			this.last = node;
		}
		
	}
	
	public NodeQ dequeue(){
		NodeQ node = null;
		if(this.first == null){
			return null;
		} else{
			this.first = this.first.getNext();
		}
		return node;
	}
	
	public void traverse(){
		NodeQ n = this.first;
		while(n != null){
			System.out.println(n.getData());
			n = n.getNext();
		}
	}

}
