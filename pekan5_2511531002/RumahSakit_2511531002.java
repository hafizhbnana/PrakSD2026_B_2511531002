package pekan5_2511531002;

import java.util.Scanner;

public class RumahSakit_2511531002 {
	Pasien_2511531002 head_1002;
	int counter_1002;
	public RumahSakit_2511531002() {
		head_1002 = null;
		counter_1002 = 0;
	}
	
	// INSERT
	public void daftarPasien_1002(String namaPasien_1002, String penyakit_1002) {
		counter_1002++;
		Pasien_2511531002 baru_1002 = new Pasien_2511531002(namaPasien_1002, penyakit_1002, counter_1002);
		if (head_1002 == null) {
			head_1002 = baru_1002; // jika list kosong, node baru menjadi head
		} else {
			Pasien_2511531002 temp_1002 = head_1002;
			while (temp_1002.getNext_1002() != null) {
				temp_1002 = temp_1002.getNext_1002(); 
			}
			temp_1002.setNext_1002(baru_1002); // menghubungkan node terakhir dengan node baru
		}
		System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_1002);
	}
	
	// DELETE HEAD
	public void panggilPasien_1002() {
		if (head_1002 == null) {
			System.out.println("Antrian kosong!");
		} else {
			System.out.println("Memanggil: " + head_1002.getNamaPasien_1002());
			head_1002 = head_1002.getNext_1002(); // menggeser head ke node berikutnya
		}
	}
	
	// DISPLAY
	public void tampilkanAntrian_1002() {
		if (head_1002 == null) {
			System.out.println("Antrian kosong!");
			return;
		}
		Pasien_2511531002 temp_1002 = head_1002;
		while (temp_1002 != null) {
			System.out.println(
				temp_1002.getAntrian_1002() + ". " +
				temp_1002.getNamaPasien_1002() + " - " +
				temp_1002.getPenyakit_1002()
			);
			temp_1002 = temp_1002.getNext_1002(); // pindah ke node berikutnya
		}
	}
	
	// SEARCH
	public void cariPasien_1002(String namaPasien_1002) {
		Pasien_2511531002 temp_1002 = head_1002;
		boolean ketemu_1002 = false;
		
		while (temp_1002 != null) {
			if (temp_1002.getNamaPasien_1002().equalsIgnoreCase(namaPasien_1002)) {
				System.out.println("Pasien ditemukan: " + temp_1002.getNamaPasien_1002());
				ketemu_1002 = true;
				break;
			}
			temp_1002 = temp_1002.getNext_1002(); // lanjut ke node berikutnya
		}
		
		if (!ketemu_1002) {
			System.out.println("Pasien tidak ditemukan!");
		}
	}
	
	// CEK STATUS
	public void cekStatus_1002() {
		if (head_1002 == null) {
			System.out.println("Antrian kosong!");
			return;
		}
		
		int jumlah_1002 = 0;
		Pasien_2511531002 temp_1002 = head_1002;
		
		// menghitung jumlah node dalam linked list
		while (temp_1002 != null) {
			jumlah_1002++;
			temp_1002 = temp_1002.getNext_1002();
		}
		
		System.out.println("Jumlah pasien: " + jumlah_1002);
		System.out.println("Pasien terdepan: " + head_1002.getNamaPasien_1002());
	}
	
	public static void main(String[] args) {
		Scanner input_1002 = new Scanner(System.in);
		RumahSakit_2511531002 rs_1002 = new RumahSakit_2511531002();
		int pilihan_1002;
		
		do {
			System.out.println("\n=== Antrian Rumah Sakit NIM: 2511531002 ===");
			System.out.println("1. Daftarkan Pasien (Insert)");
			System.out.println("2. Panggil Pasien (Delete Head)");
			System.out.println("3. Tampilkan Antrian (Display)");
			System.out.println("4. Cari Pasien (Search)");
			System.out.println("5. Cek Status Antrian");
			System.out.println("6. Keluar");
			System.out.print("Pilihan: ");
			pilihan_1002 = input_1002.nextInt();
			input_1002.nextLine();
			
			switch (pilihan_1002) {
			case 1:
				System.out.print("Masukkan Nama Pasien: ");
				String namaPasien_1002 = input_1002.nextLine();
				System.out.print("Masukkan Keluhan: ");
				String penyakit_1002 = input_1002.nextLine();
				rs_1002.daftarPasien_1002(namaPasien_1002, penyakit_1002);
				break;
			case 2:
				rs_1002.panggilPasien_1002();
				break;
			case 3:
				rs_1002.tampilkanAntrian_1002();
				break;
			case 4:
				System.out.print("Cari nama: ");
				String cari_1002 = input_1002.nextLine();
				rs_1002.cariPasien_1002(cari_1002);
				break;
			case 5:
				rs_1002.cekStatus_1002();
				break;
			case 6:
				System.out.println("Keluar...");
				break;
			default:
				System.out.println("Pilihan tidak valid!");
			}
		} while (pilihan_1002 != 6);
		input_1002.close();
	}
}
