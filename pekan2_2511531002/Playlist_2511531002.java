package pekan2_2511531002;

import java.util.ArrayList;
import java.util.Scanner;
public class Playlist_2511531002 {
	// 0. Tampilkan menu
	public static void tampilkanMenu_2511531002() {
		System.out.println("\n=== Playlist Musik NIM: 2511531002 ===");
		System.out.println("1. Tambah Lagu");
		System.out.println("2. Lihat Playlist");
		System.out.println("3. Hapus Lagu");
		System.out.println("4. Keluar");		
	}
	
	// 1. Tambah Lagu
	public static void tambahLagu_2511531002(ArrayList<Musik_2511531002> list, Scanner sc) {
		System.out.print("\nMasukkan Judul: ");
		String judul_1002 = sc.nextLine();
		System.out.print("Masukkan Penyanyi: ");
		String penyanyi_1002 = sc.nextLine();
		System.out.print("Masukkan Durasi (detik): ");
		int durasi_1002 = sc.nextInt();
		list.add(new Musik_2511531002(judul_1002, penyanyi_1002, durasi_1002));
		System.out.println("Data berhasil ditambahkan!");
	}
	
	// 2. Lihat Playlist
	public static void lihatPlaylist_2511531002(ArrayList<Musik_2511531002> list) {
		if (list.isEmpty()) {
			System.out.println("\nIsi Playlist Kosong.");
		} else {
			System.out.println("\nPlaylist:");
			for (int i = 0; i < list.size(); i++) {
				System.out.println((i + 1) + ". " + list.get(i));
			}
		}
	}
	
	// 3. Hapus Lagu
	public static void hapusLagu_2511531002(ArrayList<Musik_2511531002> list, Scanner sc) {
		System.out.print("\nMasukkan nomor lagu yang ingin dihapus: ");
		int index_1002 = sc.nextInt() - 1;
		sc.nextLine();
		
		if (index_1002 >= 0 && index_1002 < list.size()) {
			list.remove(index_1002);
			System.out.println("Lagu berhasil dihapus.");
		} else {
			System.out.println("Nomor tidak valid.");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Musik_2511531002> musikList_1002 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int pilihan_1002;
		
		do {
			tampilkanMenu_2511531002();
			System.out.print("Pilih menu: ");
			pilihan_1002 = sc.nextInt();
			sc.nextLine();
			
			switch (pilihan_1002) {
			case 1:
				tambahLagu_2511531002(musikList_1002, sc);
				break;
			case 2:
				lihatPlaylist_2511531002(musikList_1002);
				break;
			case 3:
				hapusLagu_2511531002(musikList_1002, sc);
				break;
			case 4:
				System.out.println("Keluar dari program.");
				break;
			default:
				System.out.println("Pilihan tidak valid.");
			}
		} while (pilihan_1002 != 4);
		sc.close();
	}
}
