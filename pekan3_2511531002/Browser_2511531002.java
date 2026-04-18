package pekan3_2511531002;

import java.util.Scanner;
import java.util.Stack;
public class Browser_2511531002 {
	//  0. Tampilkan Menu
	public static void tampilkanMenu_2511531002() {
		System.out.println("\n=== Browser History NIM: 2511531002 ===");
		System.out.println("1. Kunjungi Website (Push)");
		System.out.println("2. Tombol Back (Pop)");
		System.out.println("3. Lihat Halaman Aktif (Peek)");
		System.out.println("4. Keluar");
	}
	
	// 1. Kunjungi Website (Push)
	public static void kunjungiWebsite_2511531002(Stack<Website_2511531002> stack, Scanner sc) {
		System.out.print("\nMasukkan Judul: ");
		String judul_1002 = sc.nextLine();
		System.out.print("Masukkan URL: ");
		String url_1002 = sc.nextLine();
		Website_2511531002 web_1002 = new Website_2511531002(judul_1002, url_1002);
		stack.push(web_1002);
		System.out.println("Berhasil mengunjungi halaman!");
	}
	
	// 2. Tombol Back (Pop)
	public static void tombolBack_2511531002(Stack<Website_2511531002> stack) {
		if (!stack.isEmpty()) {
			Website_2511531002 hapus_1002 = stack.pop();
			System.out.println("Kembali dari: " + hapus_1002.getJudul_1002());
		} else {
			System.out.println("History kosong! Tidak bisa kembali.");
		}
	}
	
	// 3. Lihat Halaman Aktif (Peek)
	public static void lihatHalAktif_2511531002(Stack<Website_2511531002> stack) {
		if (!stack.isEmpty()) {
			System.out.println("\nHalaman aktif:");
			System.out.println(stack.peek());
		} else {
			System.out.println("Tidak ada halaman aktif.");
		}
	}
	
	public static void main(String[] args) {
		Stack<Website_2511531002> history_1002 = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int pilihan_1002;
		
		do {
			tampilkanMenu_2511531002();
			System.out.print("Pilih menu: ");
			pilihan_1002 = sc.nextInt();
			sc.nextLine();
			
			switch (pilihan_1002) {
			case 1:
				kunjungiWebsite_2511531002(history_1002, sc);
				break;
			case 2:
				tombolBack_2511531002(history_1002);
				break;
			case 3:
				lihatHalAktif_2511531002(history_1002);
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
