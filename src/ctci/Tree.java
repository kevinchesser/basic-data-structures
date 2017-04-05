package ctci;

public class Tree {

	private Node rootNode;
	
	public Tree(){
		this.rootNode = null;
	}
	
	public void add(int data){
		Node insertNode = new Node(null, null, data, 1);
		Node currentNode = this.rootNode;
		Node parentNode = currentNode;
		if(this.rootNode == null){
			this.rootNode = insertNode;
			return;
		} else{
			parentNode = currentNode;
			while(true){
				if(currentNode.getData() > data){ 
				//Data being inserted is smaller than the current nodes data
					currentNode = parentNode.getLeft();
					if(currentNode == null){
						parentNode.setLeft(insertNode);
						return;
					} else if(currentNode.getData() == data){
						currentNode.setCount(currentNode.getCount() + 1);
						return;
					}
				} else if(currentNode.getData() < data){
				//Data being inserted is greater than the current nodes data
					currentNode = parentNode.getRight();
					if(currentNode == null){
						parentNode.setRight(insertNode);
						return;
					} else if(currentNode.getData() == data){
						currentNode.setCount(currentNode.getCount() + 1);
						return;
					}
				}
				parentNode = currentNode;
			}
		}
	}
	
	public Node find(int data){
		Node currentNode = this.rootNode;
		Node parentNode = currentNode;
		if(this.rootNode == null){
			return null;
		} else{
			parentNode = currentNode;
			while(true){
				if(currentNode.getData() > data){ 
				//Data being inserted is smaller than the current nodes data
					currentNode = parentNode.getLeft();
					if(currentNode == null){
						return null;
					} else if(currentNode.getData() == data){
						return currentNode;
					}
				} else if(currentNode.getData() < data){
				//Data being inserted is greater than the current nodes data
					currentNode = parentNode.getRight();
					if(currentNode == null){
						return null;
					} else if(currentNode.getData() == data){
						return currentNode;
					}
				}
				parentNode = currentNode;
			}
		}
	}
	
	public boolean delete(int data){
		Node node = find(data);
		if(node == null){
			return false;
		} else{
			if()
		//Possible check depths of child subtrees and shift up the deeper one?
		//Check left child exists
				//move entire subtree up
		//Check right child exists
				//move subtree up
			
			return true;
		}
	}

	public void traverse(int type){
		switch(type){
			case 1:
				System.out.println("Preorder");
				preOrder(this.rootNode);
				break;
			case 2:
				System.out.println("Inorder");
				inOrder(this.rootNode);
				break;
			case 3:
				System.out.println("Postorder");
				postOrder(this.rootNode);
				break;
			default:
				break;
		}
	}

	public void preOrder(Node n){
		if(n != null){
			System.out.println(n.getData() + "(" + n.getCount() + ")");
			preOrder(n.getLeft());
			preOrder(n.getRight());
		}
	}
	
	public void postOrder(Node n){
		if(n != null){
			postOrder(n.getLeft());
			postOrder(n.getRight());
			System.out.println(n.getData() + "(" + n.getCount() + ")");
		}
	}
	
	public void inOrder(Node n){
		if(n != null){
			inOrder(n.getLeft());
			System.out.println(n.getData() + "(" + n.getCount() + ")");
			inOrder(n.getRight());
		}
	}
	
}
