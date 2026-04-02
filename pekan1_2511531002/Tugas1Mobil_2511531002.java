package pekan1_2511531002;

public class Tugas1Mobil_2511531002 {
	private String nama;
	private int tahun;
	private int cc;
	private int harga;
	private String merk;
	
	//Validator
	private static boolean isValid(String n, int t, int cc, int h, String m) {
		return !(n.isBlank() && !(t < 0) && !(cc < 0) && !(h < 0) && !(m.isBlank()));
	}
	
	//Konstruktor
	public Tugas1Mobil_2511531002(String nama, int tahun, int cc, int harga, String merk) {
		if(isValid(nama, tahun, cc, harga, merk)) {
			this.nama = nama;
			this.tahun = tahun;
			this.cc = cc;
			this.harga = harga;
			this.merk = merk;
		}
	}
	
	//Setter
	public void setNama(String nama) { this.nama = nama; }
	public void setTahun(int tahun) { this.tahun = tahun; }
	public void setCc(int cc) { this.cc = cc; }
	public void setHarga(int harga) { this.harga = harga; }
	public void setMerk(String merk) { this.merk = merk; }
	
	//Getter
	public String getNama() { return nama; }
	public int getTahun() { return tahun; }
	public int getCc() { return cc; }
	public int getHarga() { return harga; }
	public String getMerk() { return merk; }
	
	//Method-Method Tambahan
	private static Tugas1Mobil_2511531002[] cars = new Tugas1Mobil_2511531002[100];
	private static int n = 0;
	
	//Tambahkan Mobil
	public static void tambahMobil(Tugas1Mobil_2511531002 M) {
		if(n < cars.length)
		cars[n] = M;
		n++;
	}
	
	//Hapuskan Mobil berdasarkan Index
	public static void hapusMobil(int idx) {
		if(idx >= 0 && idx < n) {
			for(int i = idx; i < n-1; i++) {
				cars[i] = cars[i+1];
			}
			cars[n-1] = null;
			n--;
		}
	}
	
	//Tampilkan Mobil-Mobil
	public static void tampilData() {
		for(int i = 0; i < n; i++) {
			Tugas1Mobil_2511531002 m = cars[i];
			System.out.println(
				m.getNama()+" "+
				m.getMerk()+" "+
				m.getTahun()+" "+
				m.getCc()+"cc "+
				m.getHarga()
			);
		}
	}
}
