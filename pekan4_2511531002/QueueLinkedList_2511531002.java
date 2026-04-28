package pekan4_2511531002;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511531002 {
	public static void main(String[] args) {
		Queue<Integer> q_1002 = new LinkedList<>();
		// tambah elemen (0, 1, 2, 3, 4, 5) ke antrian
		for (int i = 0; i < 6; i++)
			q_1002.add(i);
		// Menampilkan isi antrian
		System.out.println("Elemen Antrian " + q_1002);
		// Untuk menghapus kepala antrian
		int hapus_1002 = q_1002.remove();
		System.out.println("Hapus elemen = " + hapus_1002);
		System.out.println(q_1002);
		// Untuk melihat antrian terdepan
		int depan_1002 = q_1002.peek();
		System.out.println("Kepala Antrian = " + depan_1002);
		
		int banyak_1002 = q_1002.size();
		System.out.println("Size Antrian = " + banyak_1002);
	}
}
