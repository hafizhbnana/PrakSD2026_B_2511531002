package pekan6_2511531002;

public class PenelusuranDLL_2511531002 {
	static void forwardTraversal_1002(NodeDLL_2511531002 head_1002) {
		NodeDLL_2511531002 curr_1002 = head_1002;
		while (curr_1002 != null) {
			System.out.print(curr_1002.data_1002 + " <-> ");
			curr_1002 = curr_1002.next_1002;
		}
		System.out.println();
	}
	
	static void backwardTraversal_1002(NodeDLL_2511531002 tail_1002) {
		NodeDLL_2511531002 curr_1002 = tail_1002;
		while (curr_1002 != null) {
			System.out.print(curr_1002.data_1002 + " <-> ");
			curr_1002 = curr_1002.prev_1002;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		NodeDLL_2511531002 head_1002 = new NodeDLL_2511531002(1);
		NodeDLL_2511531002 second_1002 = new NodeDLL_2511531002(2);
		NodeDLL_2511531002 third_1002 = new NodeDLL_2511531002(3);
		
		head_1002.next_1002 = second_1002;
		second_1002.prev_1002 = head_1002;
		second_1002.next_1002 = third_1002;
		third_1002.prev_1002 = second_1002;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_1002(head_1002);
		
		System.out.println("Penelusuran mundur: ");
		backwardTraversal_1002(third_1002);
	}
}
