package ctci;

public class LinkedList {
	
	private NodeLL head;
	
	public LinkedList(){
		this.head = null;
	}
	
	public void addHead(int data){
		NodeLL node = new NodeLL(data, null);
		if(this.head == null){
			this.head = node;
		} else{
			node.setNext(this.head);
			this.head = node;
		}
	}
	
	public void addTail(int data){
		NodeLL node = new NodeLL(data, null);
		if(this.head == null){
			this.head = null;
		} else{
			NodeLL n = this.head;
			while(n.getNext() != null){
				n = n.getNext();
			}
			n.setNext(node);
		}
	}
	
	public void traverse(){
		NodeLL node = this.head; 
		while(node != null){
			System.out.println(node.getData());
			node = node.getNext();
		}
	}
	
	public void reverse(){
		NodeLL currentNode = this.head;
		NodeLL nextNode = null;
		NodeLL previousNode = null;
		while(currentNode != null){
			nextNode = currentNode.getNext();
			currentNode.setNext(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		this.head = previousNode;
	}
	
	public void delete(int data){
		NodeLL node = this.head;
		while(node != null){
			
		}
	}
	
	public NodeLL getHead(){
		return this.head;
	}

}
