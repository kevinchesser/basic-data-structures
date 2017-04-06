package ctci;

public class Tree {

	private Node rootNode;
	
	public Tree(){
		this.rootNode = null;
	}
	
	public void add(int data){
		Node insertNode = new Node(null, null, null, data, 1); //Left, right, parent, data, count
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
						insertNode.setParent(parentNode);
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
						insertNode.setParent(parentNode);
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
			Node parent = node.getParent();
			if(node.getLeft() == null && node.getRight() == null){
			//Node is a leaf
				boolean left = false;
				if(parent.getLeft() == node){
					left = true;
				}
				if(left){
					parent.setLeft(null);
					return true;
				} else{
					parent.setRight(null);
					return true;
				}
			}//End node is a leaf
			if((node.getLeft() != null && node.getRight() == null) || 
					(node.getLeft() == null && node.getRight() != null)){
			//Node has only one child	
				boolean childLeft = false;
				boolean parentLeft = false;
				if(node.getLeft() != null){
					childLeft = true; //The child is the left child
				}
				if(parent.getLeft() == node){
					parentLeft = true;
				}
				if(parentLeft){ //Node being deleted is the left child of its parent
					if(childLeft){
						parent.setLeft(node.getLeft());
						return true;
					} else{
						parent.setLeft(node.getRight());
						return true;
					}
				} else{ //Node being delted is the right child of its parent
					if(childLeft){
						parent.setRight(node.getLeft());
						return true;
					} else{
						parent.setRight(node.getRight());
						return true;
					}
				}
			}//End node has one child
			if(node.getLeft() != null && node.getRight() != null){
				Node successor = getInOrderSuccessor(node);
			}
			return false;
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
	
	public Node getInOrderSuccessor(Node n){
		if(n.getRight() != null){ 
		//If the right subtree has nodes then the successor is in the right subtree, find the minimum value
			return getMinimumValue(n.getRight());
		}
		
		Node parent = n.getParent();
		while(parent != null && n == parent.getRight()){
		//If right subtree has no nodes we look for a node that is left child of its parent
			n = parent;
			parent = parent.getParent();
		}
		return parent;
	}
	
	public Node getMinimumValue(Node n){
		Node current = n;
		while(current.getLeft() != null){
			//Travel down the left side of the subtree till you find the smallest value
			current = current.getLeft();
		}
		return current;
	}
	
	public Node getRootNode(){
		return this.rootNode;
	}
	
}
