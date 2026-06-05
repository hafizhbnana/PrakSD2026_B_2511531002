package pekan8_2511531002;

import java.util.Scanner;

public class Sorting_2511531002 {
	Lagu_2511531002[] dataLagu_1002 = new Lagu_2511531002[20];
	int jumlahData_1002 = 0;
	
	// PLAYLIST LAGU
	public void inputData_1002() {
		dataLagu_1002[jumlahData_1002++] = //Song 1
				new Lagu_2511531002("No One Noticed", "The Marias", 236);
		dataLagu_1002[jumlahData_1002++] = //Song 2
				new Lagu_2511531002("Best Friend", "Rex Orange County", 262);
		dataLagu_1002[jumlahData_1002++] = //Song 3
				new Lagu_2511531002("Chicago", "Michael Jackson", 245);
		dataLagu_1002[jumlahData_1002++] = //Song 4
				new Lagu_2511531002("Made In Japan", "Buck Owens", 164);
		dataLagu_1002[jumlahData_1002++] = //Song 5
				new Lagu_2511531002("Chest Pain (I Love)", "Malcolm Todd", 200);
		dataLagu_1002[jumlahData_1002++] = //Song 6
				new Lagu_2511531002("Lovers Rock", "TV Girl", 213);
		dataLagu_1002[jumlahData_1002++] = //Song 7
				new Lagu_2511531002("NOBLE", "F3miii", 185);
		dataLagu_1002[jumlahData_1002++] = //Song 8
				new Lagu_2511531002("Isn't She Lovely", "Stevie Wonder", 199);
		dataLagu_1002[jumlahData_1002++] = //Song 9
				new Lagu_2511531002("On the Outside", "Alicia Goodwyn, Little June", 202);
		dataLagu_1002[jumlahData_1002++] = //Song 10
				new Lagu_2511531002("Akin Ka Na Lang", "The Itchyworms", 183);
	}
	
	// MENAMPILKAN DATA
	public void tampilData_1002() {
		for (int i_1002 = 0; i_1002 < jumlahData_1002; i_1002++) {
			System.out.println(
					(i_1002 + 1) + ". "
					+ dataLagu_1002[i_1002].judul_1002
					+ " - "
					+ dataLagu_1002[i_1002].penyanyi_1002
					+ " - "
					+ dataLagu_1002[i_1002].durasi_1002
					+ " detik");
		}
	}
	
	// ALGORTIMA SHELL SORT (JUDUL A-Z)
	public void shellSort_1002() {
		for (int gap_1002 = jumlahData_1002 / 2; gap_1002 > 0; gap_1002 /= 2) {
			for (int i_1002 = gap_1002; i_1002 < jumlahData_1002; i_1002++) {
				Lagu_2511531002 temp_1002 = dataLagu_1002[i_1002];
				int j_1002;
				for (j_1002 = i_1002;
						j_1002 >= gap_1002
								&& dataLagu_1002[j_1002 - gap_1002]
								.judul_1002.compareToIgnoreCase(
										temp_1002.judul_1002) > 0;
						j_1002 -= gap_1002) {
					dataLagu_1002[j_1002] = dataLagu_1002[j_1002 - gap_1002];
				}
				dataLagu_1002[j_1002] = temp_1002;
			}
		}
	}
	
	// ALGORITMA QUICK SORT (DURASI ASC)
	public void quickSort_1002(int low_1002, int high_1002) {
		if (low_1002 < high_1002) {
			int pi_1002 = partition_1002(low_1002, high_1002);
			quickSort_1002(low_1002, pi_1002 - 1);
			quickSort_1002(pi_1002 + 1, high_1002);
		}
	}
	public int partition_1002(int low_1002, int high_1002) {
		int pivot_1002 = dataLagu_1002[high_1002].durasi_1002;
		int i_1002 = low_1002 - 1;
		
		for (int j_1002 = low_1002; j_1002 < high_1002; j_1002++) {
			if (dataLagu_1002[j_1002].durasi_1002 <= pivot_1002) {
				i_1002++;
				
				Lagu_2511531002 temp_1002 = dataLagu_1002[i_1002];
				dataLagu_1002[i_1002] = dataLagu_1002[j_1002];
				dataLagu_1002[j_1002] = temp_1002;
			}
		}
		Lagu_2511531002 temp_1002 = dataLagu_1002[i_1002 + 1];
		dataLagu_1002[i_1002 + 1] = dataLagu_1002[high_1002];
		dataLagu_1002[high_1002] = temp_1002;
		
		return i_1002 + 1;
	}
	
	// ALGORITMA MERGE SORT (JUDUL A-Z)
	public void mergeSort_1002(int kiri_1002, int kanan_1002) {
		if (kiri_1002 < kanan_1002) {
			int tengah_1002 = (kiri_1002 + kanan_1002) / 2;
			
			mergeSort_1002(kiri_1002, tengah_1002);
			mergeSort_1002(tengah_1002 + 1, kanan_1002);
			
			merge_1002(kiri_1002, tengah_1002, kanan_1002);
		}
	}
	public void merge_1002(int kiri_1002, int tengah_1002, int kanan_1002) {
		int n1_1002 = tengah_1002 - kiri_1002 + 1;
		int n2_1002 = kanan_1002 - tengah_1002;
		
		Lagu_2511531002[] kiriArray_1002 = new Lagu_2511531002[n1_1002];
		Lagu_2511531002[] kananArray_1002 = new Lagu_2511531002[n2_1002];
		
		for (int i_1002 = 0; i_1002 < n1_1002; i_1002++)
			kiriArray_1002[i_1002] = dataLagu_1002[kiri_1002 + i_1002];
		for (int j_1002 = 0; j_1002 < n2_1002; j_1002++)
			kananArray_1002[j_1002] = dataLagu_1002[tengah_1002 + 1 + j_1002];
		
		int i_1002 = 0;
		int j_1002 = 0;
		int k_1002 = kiri_1002;
		
		while (i_1002 < n1_1002 && j_1002 < n2_1002) {
			if (kiriArray_1002[i_1002].judul_1002.compareToIgnoreCase(
					kananArray_1002[j_1002].judul_1002) <= 0) {
				dataLagu_1002[k_1002] = kiriArray_1002[i_1002];
				i_1002++;
			} else {
				dataLagu_1002[k_1002] = kananArray_1002[j_1002];
				j_1002++;
			}
			k_1002++;
		}
		
		while (i_1002 < n1_1002) {
			dataLagu_1002[k_1002] = kiriArray_1002[i_1002];
			i_1002++;
			k_1002++;
		}
		
		while (j_1002 < n2_1002) {
			dataLagu_1002[k_1002] = kananArray_1002[j_1002];
			j_1002++;
			k_1002++;
		}
	}
	
	// MAIN
	public static void main(String[] args) {
		Scanner input_1002 = new Scanner(System.in);
		Sorting_2511531002 playlist_1002 = new Sorting_2511531002();
		playlist_1002.inputData_1002();
		
		System.out.println("=== Sorting Playlist NIM: 2511531002 ===");
		System.out.print("Pilih Algoritma (1 = Shell, 2 = Quick, 3 = Merge): ");
		int pilihan_1002 = input_1002.nextInt();
		
		if (pilihan_1002 < 1 || pilihan_1002 > 3) {
			System.out.println();
			System.out.println("Pilihan tidak valid.");
			input_1002.close();
			return;
		}
		
		System.out.println("\nData Sebelum Sorting:");
		playlist_1002.tampilData_1002();
		
		switch (pilihan_1002) {
			case 1:
				playlist_1002.shellSort_1002();
				System.out.println("\nData Setelah Shell Sort (Judul A-Z):");
				break;
			case 2:
				playlist_1002.quickSort_1002(0, playlist_1002.jumlahData_1002 - 1);
				System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
				break;
			case 3:
				playlist_1002.mergeSort_1002(0, playlist_1002.jumlahData_1002 - 1);
				System.out.println("\nData Setelah Merge Sort (Judul A-Z):");
				break;
		}
		playlist_1002.tampilData_1002();
		input_1002.close();
	}
}
