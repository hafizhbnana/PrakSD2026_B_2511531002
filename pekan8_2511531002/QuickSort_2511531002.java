package pekan8_2511531002;

public class QuickSort_2511531002 {
	static void swap_1002(int[] arr_1002, int i_1002, int j_1002) {
		int temp_1002 = arr_1002[i_1002];
		arr_1002[i_1002] = arr_1002[j_1002];
		arr_1002[j_1002] = temp_1002;
	}
	
	static void medianOfThree_1002(int[] arr_1002, int low_1002, int high_1002) {
		int mid_1002 = low_1002 + (high_1002 - low_1002) / 2;
		if (arr_1002[low_1002] > arr_1002[mid_1002]) {
			swap_1002(arr_1002, low_1002, mid_1002);
		}
		if (arr_1002[low_1002] > arr_1002[high_1002]) {
			swap_1002(arr_1002, low_1002, high_1002);
		}
		if (arr_1002[mid_1002] > arr_1002[high_1002]) {
			swap_1002(arr_1002, mid_1002, high_1002);
		}
		swap_1002(arr_1002, mid_1002, high_1002);
	}
	
	static int partition_1002(int[] arr_1002, int low_1002, int high_1002) {
		medianOfThree_1002(arr_1002, low_1002, high_1002);
		int pivot_1002 = arr_1002[high_1002];
		int i_1002 = (low_1002 - 1);
		
		for (int j_1002 = low_1002; j_1002 <= high_1002 - 1; j_1002++) {
			if (arr_1002[j_1002] < pivot_1002) {
				i_1002++;
				swap_1002(arr_1002, i_1002, j_1002);
			}
		}
		swap_1002(arr_1002, i_1002 + 1, high_1002);
		return (i_1002 + 1);
	}
	
	static void quickSort_1002(int[] arr_1002, int low_1002, int high_1002) {
		if (low_1002 < high_1002) {
			int pi_1002 = partition_1002(arr_1002, low_1002, high_1002);
			quickSort_1002(arr_1002, low_1002, pi_1002 - 1);
			quickSort_1002(arr_1002, pi_1002 + 1, high_1002);
		}
	}
	
	public static void printArr_1002(int[] arr_1002) {
		for (int i_1002 = 0; i_1002 < arr_1002.length; i_1002++) {
			System.out.print(arr_1002[i_1002] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr_1002 = { 10, 7, 8, 9, 1, 5 };
		int N_1002 = arr_1002.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_1002(arr_1002);
		
		quickSort_1002(arr_1002, 0, N_1002 - 1);
		
		System.out.print("Data Terurut quicksort: ");
		printArr_1002(arr_1002);
	}
}
