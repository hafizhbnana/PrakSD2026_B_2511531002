package pekan9_2511531002;

public class Node_2511531002 {
	int data_1002;
	Node_2511531002 left_1002;
	Node_2511531002 right_1002;
	public Node_2511531002(int data_1002) {
		this.data_1002 = data_1002;
		left_1002 = null;
		right_1002 = null;
	}
	public void setLeft_1002(Node_2511531002 node_1002) {
		if (left_1002 == null)
			left_1002 = node_1002;
	}
	public void setRight_1002(Node_2511531002 node_1002) {
		if (right_1002 == null)
			right_1002 = node_1002;
	}
	public void setData_1002(int data_1002) {
		this.data_1002 = data_1002;
	}
	public Node_2511531002 getLeft_1002() {
		return left_1002;
	}
	public Node_2511531002 getRight_1002() {
		return right_1002;
	}
	public int getData_1002() {
		return data_1002;
	}
	
	void printPreorder_1002(Node_2511531002 node_1002) {
		if (node_1002 == null)
			return;
		System.out.print(node_1002.data_1002 + " ");
		printPreorder_1002(node_1002.left_1002);
		printPreorder_1002(node_1002.right_1002);
	}
	void printPostorder_1002(Node_2511531002 node_1002) {
		if (node_1002 == null)
			return;
		printPostorder_1002(node_1002.left_1002);
		printPostorder_1002(node_1002.right_1002);
		System.out.print(node_1002.data_1002 + " ");
	}
	void printInorder_1002(Node_2511531002 node_1002) {
		if (node_1002 == null)
			return;
		printInorder_1002(node_1002.left_1002);
		System.out.print(node_1002.data_1002 + " ");
		printInorder_1002(node_1002.right_1002);
	}
	public String print_1002() {
		return this.print_1002("",true,"");
	}
	public String print_1002(String prefix_1002, boolean isTail_1002, String sb_1002) {
		if (right_1002 != null)
			right_1002.print_1002(prefix_1002 +
					(isTail_1002 ? "|   " : "    "), false, sb_1002);
		System.out.println(prefix_1002 + (isTail_1002 ?
				"\\-- " : "/-- ") + data_1002);
		if (left_1002 != null)
			left_1002.print_1002(prefix_1002 +
					(isTail_1002 ? "    " : "|   "), true, sb_1002);
		return sb_1002;
	}
}
