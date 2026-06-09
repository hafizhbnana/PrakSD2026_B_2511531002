package pekan9_2511531002;

public class BTree_2511531002 {
	private Node_2511531002 root_1002;
	private Node_2511531002 currentNode_1002;
	public BTree_2511531002() {
		root_1002 = null;
	}
	public boolean search_1002(int data_1002) {
		return search_1002(root_1002, data_1002);
	}
	private boolean search_1002(Node_2511531002 node_1002, int data_1002) {
		if (node_1002.getData_1002() == data_1002)
			return true;
		if (node_1002.getLeft_1002() != null)
			if (search_1002(node_1002.getLeft_1002(), data_1002))
				return true;
		if (node_1002.getRight_1002() != null)
			if (search_1002(node_1002.getRight_1002(), data_1002))
				return true;
		return false;
	}
	public void printInorder_1002() {
		root_1002.printInorder_1002(root_1002);
	}
	public void printPreOrder_1002() {
		root_1002.printPreorder_1002(root_1002);
	}
	public void printPostOrder_1002() {
		root_1002.printPostorder_1002(root_1002);
	}
	
	public Node_2511531002 getRoot_1002() {
		return root_1002;
	}
	public boolean isEmpty_1002() {
		return root_1002 == null;
	}
	public int countNodes_1002() {
		return countNodes_1002(root_1002);
	}
	private int countNodes_1002(Node_2511531002 node_1002) {
		int count = 1;
		if (node_1002 == null) {
			return 0;
		}	else {
			count += countNodes_1002 (node_1002.getLeft_1002());
			count += countNodes_1002 (node_1002.getRight_1002());
			return count;
		}
	}
	
	public void print_1002() {
		root_1002.print_1002();
	}
	public Node_2511531002 getCurrent_1002() {
		return currentNode_1002;
	}
	
	public void setCurrent_1002(Node_2511531002 node_1002) {
		this.currentNode_1002 = node_1002;
	}
	
	public void setRoot_1002(Node_2511531002 root) {
		this.root_1002 = root;
	}
}

