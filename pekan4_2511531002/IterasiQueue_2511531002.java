package pekan4_2511531002;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class IterasiQueue_2511531002 {
	public static void main(String[] args) {
		Queue<String> q_1002 = new LinkedList<>();
		
		q_1002.add("Praktikum");
		q_1002.add("Struktur");
		q_1002.add("Data");
		q_1002.add("Dan");
		q_1002.add("Algoritma");
		Iterator<String> iterator = q_1002.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
