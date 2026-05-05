package pekan5_2511531002;

public class TambahSLL_2511531002 {
	 public static NodeSLL_2511531002 insertAtFront_2511531002(NodeSLL_2511531002 head_1002, int value_1002) {
		 NodeSLL_2511531002 new_node_1002 = new NodeSLL_2511531002(value_1002);
		 new_node_1002.next_1002 = head_1002;
		 return new_node_1002;
	 }
	 
	 public static NodeSLL_2511531002 insertAtEnd_2511531002(NodeSLL_2511531002 head_1002, int value_1002) {
		 NodeSLL_2511531002 newNode_1002 = new NodeSLL_2511531002(value_1002);
		 if (head_1002 == null) {
			 return newNode_1002;
		 }
		 NodeSLL_2511531002 last_1002 = head_1002;
		 while (last_1002.next_1002 != null) {
			 last_1002 = last_1002.next_1002;
		 }
		 last_1002.next_1002 = newNode_1002;
		 return head_1002;
	 }
	 
	 static NodeSLL_2511531002 GetNode_2511531002(int data_1002) {
		 return new NodeSLL_2511531002(data_1002);
	 }
	 
	 static NodeSLL_2511531002 insertPos_2511531002(NodeSLL_2511531002 headNode_1002, int position_1002, int value_1002) {
		 NodeSLL_2511531002 head_1002 = headNode_1002;
		 if (position_1002 < 1)
			 System.out.print("Invalid position");
		 if (position_1002 == 1) {
			 NodeSLL_2511531002 new_node_1002 = new NodeSLL_2511531002(value_1002);
			 new_node_1002.next_1002 = head_1002;
			 return new_node_1002;
		 } else {
			 while (position_1002-- != 0) {
				 if (position_1002 == 1) {
					 NodeSLL_2511531002 newNode_1002 = GetNode_2511531002(value_1002);
					 newNode_1002.next_1002 = headNode_1002.next_1002;
					 headNode_1002.next_1002 = newNode_1002;
					 break;
				 }
				 headNode_1002 = headNode_1002.next_1002;
			 }
			 if (position_1002 != 1)
				 System.out.print("Posisi di luar jangkauan");
			 return head_1002;
		 }
	 }
	 
	 public static void printList_2511531002(NodeSLL_2511531002 head_1002) {
		 NodeSLL_2511531002 curr_1002 = head_1002;
		 while (curr_1002.next_1002 != null) {
			 System.out.print(curr_1002.data_1002+"-->");
			 curr_1002 = curr_1002.next_1002;
		 }
		 if (curr_1002.next_1002 == null) {
			 System.out.print(curr_1002.data_1002);
			 System.out.println();
		 }
	 }
	 
	 public static void main(String[] args) {
		 NodeSLL_2511531002 head_1002 = new NodeSLL_2511531002(2);
		 head_1002.next_1002 = new NodeSLL_2511531002(3);
		 head_1002.next_1002.next_1002 = new NodeSLL_2511531002(5);
		 head_1002.next_1002.next_1002.next_1002 = new NodeSLL_2511531002(6);
		 System.out.print("Senarai berantai awal: ");
		 printList_2511531002(head_1002);

		 System.out.print("Tambah 1 simpul di depan: ");
		 int data_1002 = 1;
		 head_1002 = insertAtFront_2511531002(head_1002, data_1002);
		 printList_2511531002(head_1002);

		 System.out.print("Tambah 1 simpul di belakang: ");
		 int data2_1002 = 7;
		 head_1002 = insertAtEnd_2511531002(head_1002, data2_1002);
		 printList_2511531002(head_1002);
		 
		 System.out.print("Tambah 1 simpul ke data 4: ");
		 int data3_1002 = 4;
		 int pos_1002 = 4;
		 head_1002 = insertPos_2511531002(head_1002, pos_1002, data3_1002);
		 printList_2511531002(head_1002);
	 }
}
