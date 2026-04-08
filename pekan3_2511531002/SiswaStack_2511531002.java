package pekan3_2511531002;

import java.util.ArrayList;
class Siswa_2511531002 {
	String nama;
	int nim;
	
	public Siswa_2511531002(String nama, int nim) {
		this.nama = nama;
		this.nim = nim;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim + ", Nama: " + nama;
	}
}
public class SiswaStack_2511531002 {
	private ArrayList<Siswa_2511531002> stack;
	
	public SiswaStack_2511531002() {
		stack = new ArrayList<>();
	}
	
	public void push(Siswa_2511531002 mhs) {
		stack.add(mhs);
	}
	
	public Siswa_2511531002 pop() {
		if (!isEmpty()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}
	
	public Siswa_2511531002 peek() {
		if (!isEmpty()) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa_2511531002() {
		for (int i = stack.size() - 1; i >= 0; i--) {
			System.out.println(stack.get(i));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511531002 studentStack_2511531002 = new SiswaStack_2511531002();
		
		Siswa_2511531002 mhs1 = new Siswa_2511531002("Ali", 1);
		Siswa_2511531002 mhs2 = new Siswa_2511531002("Boby", 2);
		Siswa_2511531002 mhs3 = new Siswa_2511531002("Charles", 3);
		
		studentStack_2511531002.push(mhs1);
		studentStack_2511531002.push(mhs2);
		studentStack_2511531002.push(mhs3);
		
		System.out.println("Siswa di dalam stack: ");
		studentStack_2511531002.tampilkanSiswa_2511531002();
		
		System.out.println("siswa teratas: " + studentStack_2511531002.peek());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack_2511531002.pop());
		System.out.println("daftar siswa setelah di pop: ");
		studentStack_2511531002.tampilkanSiswa_2511531002();
	}
}
