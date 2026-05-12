package pekan6_2511531002;

public class HapusDLL_2511531002 {
	public static NodeDLL_2511531002 delHead_1002(NodeDLL_2511531002 head_1002) {
		if (head_1002 == null) return null;
		head_1002 = head_1002.next_1002;
		if (head_1002 != null) head_1002.prev_1002 = null;
		return head_1002;
	}
	
	public static NodeDLL_2511531002 delLast_1002(NodeDLL_2511531002 head_1002) {
		if (head_1002 == null) return null;
		if (head_1002.next_1002 == null) return null;
		NodeDLL_2511531002 curr_1002 = head_1002;
		while (curr_1002.next_1002 != null) curr_1002 = curr_1002.next_1002;
		if (curr_1002.prev_1002 != null) curr_1002.prev_1002.next_1002 = null;
		return head_1002;
	}
	
	public static NodeDLL_2511531002 delPos_1002(NodeDLL_2511531002 head_1002, int pos_1002) {
		if (head_1002 == null) return head_1002;
		NodeDLL_2511531002 curr_1002 = head_1002;
		for (int i = 1; curr_1002 != null && i < pos_1002; ++i ) curr_1002 = curr_1002.next_1002;
		if (curr_1002 == null) return head_1002;
		if (curr_1002.prev_1002 != null) curr_1002.prev_1002.next_1002 = curr_1002.next_1002;
		if (curr_1002.next_1002 != null) curr_1002.next_1002.prev_1002 = curr_1002.prev_1002;
		if (head_1002 == curr_1002) head_1002 = curr_1002.next_1002;
		return head_1002;
	}
	
	public static void printList_1002(NodeDLL_2511531002 head_1002) {
		NodeDLL_2511531002 curr_1002 = head_1002;
		while (curr_1002 != null) {
			System.out.print(curr_1002.data_1002 + " ");
			curr_1002 = curr_1002.next_1002;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		NodeDLL_2511531002 head_1002 = new NodeDLL_2511531002(1);
		head_1002.next_1002 = new NodeDLL_2511531002(2);
		head_1002.next_1002.prev_1002 = head_1002;
		
		head_1002.next_1002.next_1002 = new NodeDLL_2511531002(3);
		head_1002.next_1002.next_1002.prev_1002 = head_1002.next_1002;
		
		head_1002.next_1002.next_1002.next_1002 = new NodeDLL_2511531002(4);
		head_1002.next_1002.next_1002.next_1002.prev_1002 = head_1002.next_1002.next_1002;
		
		head_1002.next_1002.next_1002.next_1002.next_1002 = new NodeDLL_2511531002(5);
		head_1002.next_1002.next_1002.next_1002.next_1002.prev_1002 = head_1002.next_1002.next_1002.next_1002;
		
		System.out.print("DLL Awal: ");
		printList_1002(head_1002);
		
		System.out.print("Setelah head dihapus: ");
		head_1002 = delHead_1002(head_1002);
		printList_1002(head_1002);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_1002 = delLast_1002(head_1002);
		printList_1002(head_1002);
		
		System.out.print("Menghapus node ke 2: ");
		head_1002 = delPos_1002(head_1002, 2);
		printList_1002(head_1002);
	}
}
