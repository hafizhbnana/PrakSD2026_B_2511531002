package pekan5_2511531002;

public class PencarianSLL_2511531002 {
	static boolean searchKey_2511531002(NodeSLL_2511531002 head_1002, int key_1002) {
		NodeSLL_2511531002 curr_1002 = head_1002;
		while (curr_1002 != null) {
			if (curr_1002.data_1002 == key_1002)
				return true;
			curr_1002 = curr_1002.next_1002;
		}
		return false;
	}
	
	public static void traversal_2511531002(NodeSLL_2511531002 head_1002) {
		NodeSLL_2511531002 curr_1002 = head_1002;
		while (curr_1002 != null) {
			System.out.print(" " + curr_1002.data_1002);
			curr_1002 = curr_1002.next_1002;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		NodeSLL_2511531002 head_1002 = new NodeSLL_2511531002(14);
		head_1002.next_1002 = new NodeSLL_2511531002(21);
		head_1002.next_1002.next_1002 = new NodeSLL_2511531002(13);
		head_1002.next_1002.next_1002.next_1002 = new NodeSLL_2511531002(30);
		head_1002.next_1002.next_1002.next_1002.next_1002 = new NodeSLL_2511531002(10);
		System.out.print("Penelusuran SLL : ");
		traversal_2511531002(head_1002);
		
		int key_1002 = 30;
		System.out.print("Cari data " + key_1002 + " = ");
		if (searchKey_2511531002(head_1002, key_1002))
			System.out.print("Ketemu");
		else
			System.out.print("Tidak ada");
	}
}
