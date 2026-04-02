package pekan1_2511531002;

public class Tugas1MobilDriver_2511531002 {
	public static void main(String[] args) {
		Tugas1Mobil_2511531002 M1 = new Tugas1Mobil_2511531002("Avanza", 2020, 1300, 150000000, "Toyota");
		Tugas1Mobil_2511531002 M2 = new Tugas1Mobil_2511531002("HR-V", 2025, 1500, 430000000, "Honda");
		Tugas1Mobil_2511531002 M3 = new Tugas1Mobil_2511531002("Corolla", 1996, 1500, 80000000, "Toyota");
		Tugas1Mobil_2511531002 M4 = new Tugas1Mobil_2511531002("Forester", 2015, 2000, 200000000, "Ford");
		Tugas1Mobil_2511531002 M5 = new Tugas1Mobil_2511531002("CR-V", 2024, 1500, 825000000, "Honda");
		
		Tugas1Mobil_2511531002.tambahMobil(M1);
		Tugas1Mobil_2511531002.tambahMobil(M2);
		Tugas1Mobil_2511531002.tambahMobil(M3);
		Tugas1Mobil_2511531002.tambahMobil(M4);
		Tugas1Mobil_2511531002.tambahMobil(M5);
		
		System.out.println("=== Daftar Mobil ===");
		Tugas1Mobil_2511531002.tampilData();
		
		System.out.println("\n=== Hapus Mobil Index 1 ===");
		Tugas1Mobil_2511531002.hapusMobil(3);
		
		System.out.println("\n=== Daftar Mobil Setelah Dihapus ===");
		Tugas1Mobil_2511531002.tampilData();
	}
}
