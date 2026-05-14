package pekan6_2511531002;
import java.util.Scanner;

public class Musik_2511531002 {
	Lagu_2511531002 head_1002;
	Lagu_2511531002 tail_1002;
	
	// INSERT
	public void tambahLagu_1002(String judul_1002, String penyanyi_1002) {
		Lagu_2511531002 laguBaru_1002 = new Lagu_2511531002(judul_1002, penyanyi_1002);
		
		if (head_1002 == null) { //Jika playlist kosong
			head_1002 = laguBaru_1002;
			tail_1002 = laguBaru_1002;
		} else {
			tail_1002.next_1002 = laguBaru_1002;
			laguBaru_1002.prev_1002 = tail_1002;
			tail_1002 = laguBaru_1002;
		}
		
		System.out.println("Lagu berhasil ditambahkan!");
	}
	
	// DELETE HEAD
	public void hapusLaguAwal_1002() {
		if (head_1002 == null) { // Jika playlist kosong
			System.out.println("Playlist kosong!");
			return;
		}
		
		System.out.println("Lagu \"" + head_1002.getJudul_1002() + "\" berhasil dihapus.");
		
		if (head_1002 == tail_1002) { // Jika hanya ada satu lagu
			head_1002 = null;
			tail_1002 = null;
		} else {
			head_1002 = head_1002.next_1002;
			head_1002.prev_1002 = null;
		}
	}
	
	// DISPLAY FORWARD
	public void tampilMaju_1002() {
		if (head_1002 == null) { // Jika playlist kosong
			System.out.println("Playlist kosong!");
			return;
		}
		
		Lagu_2511531002 bantu_1002 = head_1002;
		
		System.out.println("\n=== Playlist Maju ===");
		while (bantu_1002 != null) {
			System.out.println("Judul    : " + bantu_1002.getJudul_1002());
			System.out.println("Penyanyi : " + bantu_1002.getPenyanyi_1002());
			System.out.println("-------------------------");
			bantu_1002 = bantu_1002.next_1002;
		}
	}
	
	// DISPLAY BACKWARD
	public void tampilMundur_1002() {
		if (tail_1002 == null) { // Jika playlist kosong
			System.out.println("Playlist kosong!");
			return;
		}
		
		Lagu_2511531002 bantu_1002 = tail_1002;
		
		System.out.println("\n=== Playlist Mundur ===");
		while (bantu_1002 != null) {
			System.out.println("Judul    : " + bantu_1002.getJudul_1002());
			System.out.println("Penyanyi : " + bantu_1002.getPenyanyi_1002());
			System.out.println("-------------------------");
			bantu_1002 = bantu_1002.prev_1002;
		}
	}
	
	// SEARCH
	public void cariLagu_1002(String judulCari_1002) {
		if (head_1002 == null) { // Jika playlist kosong
			System.out.println("Playlist kosong!");
			return;
		}
		
		Lagu_2511531002 bantu_1002 = head_1002;
		boolean ketemu_1002 = false;
		
		while (bantu_1002 != null) {
			if (bantu_1002.getJudul_1002().equalsIgnoreCase(judulCari_1002)) {
				System.out.println("\nLagu ditemukan!");
				System.out.println("Judul    : " + bantu_1002.getJudul_1002());
				System.out.println("Penyanyi : " + bantu_1002.getPenyanyi_1002());
				
				ketemu_1002 = true;
				break;
			}
			bantu_1002 = bantu_1002.next_1002;
		}
		if (!ketemu_1002) { // Jika lagu tidak ketemu
			System.out.println("Lagu tidak ditemukan!");
		}
	}
	
	// MAIN
	public static void main(String[] args) {
		Scanner input_1002 = new Scanner(System.in);
		Musik_2511531002 playlist_1002 = new Musik_2511531002();
		int pilihan_1002;
		
		do {
			System.out.println("\n=== Playlist Musik NIM: 2511531002 ===");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Hapus Lagu Pertama");
			System.out.println("3. Lihat Playlist (Maju)");
			System.out.println("4. Lihat Playlist (Mundur)");
			System.out.println("5. Cari Lagu");
			System.out.println("6. Keluar");
			System.out.print("Pilihan: ");
			
			pilihan_1002 = input_1002.nextInt();
			input_1002.nextLine();
			
			switch (pilihan_1002) {
			case 1:
				System.out.print("Judul    : ");
				String judul_1002 = input_1002.nextLine();
				
				System.out.print("Penyanyi : ");
				String penyanyi_1002 = input_1002.nextLine();
				
				playlist_1002.tambahLagu_1002(judul_1002, penyanyi_1002);
				break;
			case 2:
				playlist_1002.hapusLaguAwal_1002();
				break;
			case 3:
				playlist_1002.tampilMaju_1002();
				break;
			case 4:
				playlist_1002.tampilMundur_1002();
				break;
			case 5:
				System.out.print("Masukkan judul lagu yang dicari : ");
				String cari_1002 = input_1002.nextLine();
				
				playlist_1002.cariLagu_1002(cari_1002);
				break;
			case 6:
				System.out.println("Program selesai...");
				break;
			default:
				System.out.println("Pilihan tidak valid!");
			}
		} while (pilihan_1002 != 6);
		
		input_1002.close();
	}
}
