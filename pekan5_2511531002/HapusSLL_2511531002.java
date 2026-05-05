package pekan5_2511531002;

public class HapusSLL_2511531002 {
	public static NodeSLL_2511531002 deleteHead_2511531002(NodeSLL_2511531002 head_1002) {
		if (head_1002 == null) return null;
		head_1002 = head_1002.next_1002;
		return head_1002;
	}
	
	public static NodeSLL_2511531002 removeLastNode_251153102(NodeSLL_2511531002 head_1002) {
		if (head_1002 == null) return null;
		if (head_1002.next_1002 == null) return null;
		NodeSLL_2511531002 secondLast_1002 = head_1002;
		while (secondLast_1002.next_1002.next_1002 != null) {
			secondLast_1002 = secondLast_1002.next_1002;
		}
		secondLast_1002.next_1002 = null;
		return head_1002;
	}
	
	public static NodeSLL_2511531002 deleteNode_2511531002(NodeSLL_2511531002 head_1002, int position_1002) {
		NodeSLL_2511531002 temp_1002 = head_1002;
		NodeSLL_2511531002 prev_1002 = null;
		if (temp_1002 == null) return head_1002;
		if (position_1002 == 1) {
			head_1002 = temp_1002.next_1002;
			return head_1002;
		}
		
		for (int i = 1; temp_1002 != null && i < position_1002; i++) {
			prev_1002 = temp_1002;
			temp_1002 = temp_1002.next_1002;
		}
		if (temp_1002 != null)
			prev_1002.next_1002 = temp_1002.next_1002;
		else
			System.out.println("Data tidak ada");
		return head_1002;
	}
	
	public static void printList_2511531002(NodeSLL_2511531002 head_1002) {
		NodeSLL_2511531002 curr_1002 = head_1002;
		while (curr_1002.next_1002 != null) {
			System.out.print(curr_1002.data_1002+"-->");
			curr_1002 = curr_1002.next_1002;
		}
		if (curr_1002.next_1002 == null)
			System.out.print(curr_1002.data_1002);
		System.out.println();
	}
	
	public static void main(String[] args) {
		NodeSLL_2511531002 head_1002 = new NodeSLL_2511531002(1);
		head_1002.next_1002 = new NodeSLL_2511531002(2);
		head_1002.next_1002.next_1002 = new NodeSLL_2511531002(3);
		head_1002.next_1002.next_1002.next_1002 = new NodeSLL_2511531002(4);
		head_1002.next_1002.next_1002.next_1002.next_1002 = new NodeSLL_2511531002(5);
		head_1002.next_1002.next_1002.next_1002.next_1002.next_1002 = new NodeSLL_2511531002(6);
		
		System.out.println("List awal: ");
		printList_2511531002(head_1002);
		
		head_1002 = deleteHead_2511531002(head_1002);
		System.out.println("List setelah head dihapus: ");
		printList_2511531002(head_1002);
		
		head_1002 = removeLastNode_251153102(head_1002);
		System.out.println("List setelah simpul terakhir di hapus: ");
		printList_2511531002(head_1002);
		
		int position_1002 = 2;
		head_1002 = deleteNode_2511531002(head_1002, position_1002);
		System.out.println("List setelah posisi 2 dihapus: ");
		printList_2511531002(head_1002);
	}
}
