package pekan8_2511531002;

public class MergeSort_2511531002 {
	void merge_1002(int arr_1002[], int l_1002, int m_1002, int r_1002) {
		int n1_1002 = m_1002 - l_1002 + 1;
		int n2_1002 = r_1002 - m_1002;
		
		int L_1002[] = new int[n1_1002];
		int R_1002[] = new int[n2_1002];
		
		for (int i_1002 = 0; i_1002 < n1_1002; ++i_1002)
			L_1002[i_1002] = arr_1002[l_1002 + i_1002];
		for (int j_1002 = 0; j_1002 < n2_1002; ++j_1002)
			R_1002[j_1002] = arr_1002[m_1002 + 1 + j_1002];
		int i_1002 = 0, j_1002 = 0;
		
		int k_1002 = l_1002;
		while (i_1002 < n1_1002 && j_1002 < n2_1002) {
			if (L_1002[i_1002] <= R_1002[j_1002]) {
				arr_1002[k_1002] = L_1002[i_1002];
				i_1002++;
			} else {
				arr_1002[k_1002] = R_1002[j_1002];
				j_1002++;
			}
			k_1002++;
		}
		
		while (i_1002 < n1_1002) {
			arr_1002[k_1002] = L_1002[i_1002];
			i_1002++;
			k_1002++;
		}
		
		while (j_1002 < n2_1002) {
			arr_1002[k_1002] = R_1002[j_1002];
			j_1002++;
			k_1002++;
		}
	}
	
	void sort_1002(int arr_1002[], int l_1002, int r_1002) {
		if (l_1002 < r_1002) {
			int m_1002 = (l_1002 + r_1002) / 2;
			sort_1002(arr_1002, l_1002, m_1002);
			sort_1002(arr_1002, m_1002 + 1, r_1002);
			merge_1002(arr_1002, l_1002, m_1002, r_1002);
		}
	}
	
	static void printArray_1002(int arr_1002[]) {
		int n_1002 = arr_1002.length;
		for (int i_1002 = 0; i_1002 < n_1002; ++i_1002)
			System.out.print(arr_1002[i_1002] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr_1002[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Sebelum terurut");
		printArray_1002(arr_1002);
		MergeSort_2511531002 ob_1002 = new MergeSort_2511531002();
		ob_1002.sort_1002(arr_1002, 0, arr_1002.length - 1);
		System.out.println("\nSesudah Terurut menggunakan merge Sort");
		printArray_1002(arr_1002);
	}
}
