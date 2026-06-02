package pekan8_2511531002;

public class ShellSort_2511531002 {
	public static void shellSort_1002(int[] A_1002) {
		int n_1002 = A_1002.length;
		int gap_1002 = n_1002 / 2;
		while (gap_1002 > 0) {
			for (int i_1002 = gap_1002; i_1002 < n_1002; i_1002++) {
				int temp_1002 = A_1002[i_1002];
				int j_1002 = i_1002;
				while (j_1002 >= gap_1002 && A_1002[j_1002 - gap_1002] > temp_1002) {
					A_1002[j_1002] = A_1002[j_1002 - gap_1002];
					j_1002 = j_1002 - gap_1002;
				}
				A_1002[j_1002] = temp_1002;
			}
			gap_1002 = gap_1002 / 2;
		}
	}
	
	public static void main(String[] args) {
		int[] data_1002 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray_1002(data_1002);
		
		shellSort_1002(data_1002);
		
		System.out.print("Sesudah: ");
		printArray_1002(data_1002);
	}
	
	public static void printArray_1002(int[] arr_1002) {
		for (int i_1002 : arr_1002) System.out.print(i_1002 + " ");
		System.out.println();
	}
}
