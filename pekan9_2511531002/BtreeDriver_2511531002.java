package pekan9_2511531002;

public class BtreeDriver_2511531002 {
	public static void main(String[] args) {
		// Membuat Pohon
		BTree_2511531002 tree_1002 = new BTree_2511531002();
		System.out.print("Jumlah Simpul awal pohon: ");
		System.out.println(tree_1002.countNodes_1002());
		
		// Menambahkan Simpul Data
		Node_2511531002 root_1002 = new Node_2511531002(1);
		
		// Menjadikan Simpul 1 Sebagai Root
		tree_1002.setRoot_1002(root_1002);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_1002.countNodes_1002());
		Node_2511531002 node2_1002 = new Node_2511531002(2);
		Node_2511531002 node3_1002 = new Node_2511531002(3);
		Node_2511531002 node4_1002 = new Node_2511531002(4);
		Node_2511531002 node5_1002 = new Node_2511531002(5);
		Node_2511531002 node6_1002 = new Node_2511531002(6);
		Node_2511531002 node7_1002 = new Node_2511531002(7);
		Node_2511531002 node8_1002 = new Node_2511531002(8);
		Node_2511531002 node9_1002 = new Node_2511531002(9);
		root_1002.setLeft_1002(node2_1002);
		node2_1002.setLeft_1002(node4_1002);
		node2_1002.setRight_1002(node5_1002);
		node4_1002.setRight_1002(node8_1002);
		root_1002.setRight_1002(node3_1002);
		node3_1002.setLeft_1002(node6_1002);
		node3_1002.setRight_1002(node7_1002);
		node6_1002.setLeft_1002(node9_1002);
		
		// Set Root
		tree_1002.setCurrent_1002(tree_1002.getRoot_1002());
		System.out.println("Menampilkan simpul terakhir: ");
		System.out.println(tree_1002.getCurrent_1002().getData_1002());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_1002.countNodes_1002());
		System.out.println("InOrder: ");
		tree_1002.printInorder_1002();
		System.out.println("\nPostorder: ");
		tree_1002.printPostOrder_1002();
		System.out.println("\nMenampilkan simpul dalam bentuk pohon");
		tree_1002.print_1002();
	}
}
