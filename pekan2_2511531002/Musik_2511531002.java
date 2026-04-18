package pekan2_2511531002;

public class Musik_2511531002 {
	private String judul_1002;
	private String penyanyi_1002;
	private int durasi_1002;
	
	public Musik_2511531002(String judul_1002, String penyanyi_1002, int durasi_1002) {
		this.judul_1002 = judul_1002;
		this.penyanyi_1002 = penyanyi_1002;
		this.durasi_1002 = durasi_1002;
	}
	
	public String getJudul_1002() { return judul_1002; }
	public String getPenyanyi_1002() { return penyanyi_1002; }
	public int getDurasi_1002() { return durasi_1002; }
	
	public void setJudul_1002(String judul_1002) { this.judul_1002 = judul_1002; }
	public void setPenyanyi_1002(String penyanyi_1002) { this.penyanyi_1002 = penyanyi_1002; }
	public void setDurasi_1002(int durasi_1002) { this.durasi_1002 = durasi_1002; }
	
	@Override
	public String toString() {
		return judul_1002 + " - " + penyanyi_1002 + " (" + durasi_1002 + " detik)";
	}
}
