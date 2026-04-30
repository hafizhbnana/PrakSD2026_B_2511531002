package pekan4_2511531002;

import java.util.Scanner;

public class AntrianLoket_2511531002 {
	public static void main(String[] args) {
		Scanner input_1002 = new Scanner(System.in);
		Queue_2511531002 q_1002 = new Queue_2511531002(10);
		
		int pilihan_1002;
		String nama_1002;
		
		do {
			System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
			System.out.println("1. Tambah Antrian");
			System.out.println("2. Hapus Antrian");
			System.out.println("3. Tampilkan Antrian");
			System.out.println("4. Reverse");
			System.out.println("5. Keluar");
			System.out.print("Pilih menu: ");
			pilihan_1002 = input_1002.nextInt();
			input_1002.nextLine();
			
			switch (pilihan_1002) {
			case 1:
				System.out.println("Masukkan nama pelanggan: ");
				nama_1002 = input_1002.nextLine();
				q_1002.enqueue_1002(nama_1002);
				break;
			case 2:
				q_1002.dequeue_1002();
				break;
			case 3:
				q_1002.display_1002();
				break;
			case 4:
				q_1002.reverse_1002();
				break;
			case 5:
				System.out.println("Program selesai");
				break;
			default:
				System.out.println("Pilihan tidak valid");
			}
		} while (pilihan_1002 != 5);
		input_1002.close();
	}
}
