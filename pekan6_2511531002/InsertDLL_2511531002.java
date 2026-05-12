package pekan6_2511531002;

public class InsertDLL_2511531002 {
	static NodeDLL_2511531002 insertBegin_1002(NodeDLL_2511531002 head_1002, int data_1002) {
		NodeDLL_2511531002 new_node_1002 = new NodeDLL_2511531002(data_1002);
		new_node_1002.next_1002 = head_1002;
		if (head_1002 != null) {
			head_1002.prev_1002 = new_node_1002;
		}
		return new_node_1002;
	}
	
	public static NodeDLL_2511531002 insertEnd_1002(NodeDLL_2511531002 head_1002, int newData_1002) {
		NodeDLL_2511531002 newNode_1002 = new NodeDLL_2511531002(newData_1002);
		if (head_1002 == null) {
			head_1002 = newNode_1002;
		} else {
			NodeDLL_2511531002 curr_1002 = head_1002;
			while (curr_1002.next_1002 != null) {
				curr_1002 = curr_1002.next_1002;
			}
			curr_1002.next_1002 = newNode_1002;
			newNode_1002.prev_1002 = curr_1002;
		}
		return head_1002;
	}
	
	public static NodeDLL_2511531002 insertAtPosition_1002(NodeDLL_2511531002 head_1002, int pos_1002, int new_data_1002) {
		NodeDLL_2511531002 new_node_1002 = new NodeDLL_2511531002(new_data_1002);
		if (pos_1002 == 1) {
			new_node_1002.next_1002 = head_1002;
			if (head_1002 != null) {
				head_1002.prev_1002 = new_node_1002;
			}
			head_1002 = new_node_1002;
			return head_1002;
		}
		NodeDLL_2511531002 curr_1002 = head_1002;
		for (int i = 1; i < pos_1002 - 1 && curr_1002 != null; ++i) {
			curr_1002 = curr_1002.next_1002;
		}
		if (curr_1002 == null) {
			System.out.println("Posisi tidak ada");
			return head_1002;
		}
		new_node_1002.prev_1002 = curr_1002;
		new_node_1002.next_1002 = curr_1002.next_1002;
		curr_1002.next_1002 = new_node_1002;
		if (new_node_1002.next_1002 != null) {
			new_node_1002.next_1002.prev_1002 = new_node_1002;
		}
		return head_1002;
	}
	
	public static void printList_1002(NodeDLL_2511531002 head_1002) {
		NodeDLL_2511531002 curr_1002 = head_1002;
		while (curr_1002 != null) {
			System.out.print(curr_1002.data_1002 + " <-> ");
			curr_1002 = curr_1002.next_1002;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511531002 head_1002 = new NodeDLL_2511531002(2);
		head_1002.next_1002 = new NodeDLL_2511531002(3);
		head_1002.next_1002.prev_1002 = head_1002;
		head_1002.next_1002.next_1002 = new NodeDLL_2511531002(5);
		head_1002.next_1002.next_1002.prev_1002 = head_1002.next_1002;
		
		// cetak dll awal
		System.out.print("DLL Awal: ");
		printList_1002(head_1002);
		
		// tambah 1 di awal
		head_1002 = insertBegin_1002(head_1002, 1);
		System.out.print("Simpul 1 ditambah di awal: ");
		printList_1002(head_1002);
		
		// tambah 6 di akhir
		System.out.print("Simpul 6 ditambah di akhir: ");
		int data_1002 = 6;
		head_1002 = insertEnd_1002(head_1002, data_1002);
		printList_1002(head_1002);
		
		// menambah node 4 di posisi 4
		System.out.print("Tambah node 4 di posisi 4: ");
		int data2_1002 = 4;
		int pos_1002 = 4;
		head_1002 = insertAtPosition_1002(head_1002, pos_1002, data2_1002);
		printList_1002(head_1002);
	}
}
