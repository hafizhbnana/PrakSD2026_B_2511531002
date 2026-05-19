package pekan7_2511531002;

public class SelectionSort_2511531002 {
	public static void SelectionSort_2511531002(int[] arr_1002) {
		int n_1002 = arr_1002.length;
		for (int i_1002 = 0; i_1002 < n_1002; i_1002++) {
			int minIndex_1002 = i_1002;
			for (int j_1002 = i_1002 + 1; j_1002 < n_1002; j_1002++) {
				if (arr_1002[j_1002] < arr_1002[minIndex_1002]) {
					minIndex_1002 = j_1002;
				}
			}
			int temp_1002 = arr_1002[i_1002];
			arr_1002[i_1002] = arr_1002[minIndex_1002];
			arr_1002[minIndex_1002] = temp_1002;
		}
	}
	
	public static void main(String[] args) {
		int arr_1002[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_1002 = arr_1002.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_1002 = 0; i_1002 < n_1002; i_1002++)
			System.out.print(arr_1002[i_1002] + " ");
		System.out.println("");
		SelectionSort_2511531002(arr_1002);
		System.out.printf("array yang terurut:\n");
		for (int i_1002 = 0; i_1002 < n_1002; i_1002++)
			System.out.print(arr_1002[i_1002] + " ");
		System.out.println("");
	}
}
