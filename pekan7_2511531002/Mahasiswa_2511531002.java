package pekan7_2511531002;

public class Mahasiswa_2511531002 {
	private String nama_1002;
	private String nim_1002;
	private String prodi_1002;
	
	public Mahasiswa_2511531002(String nama_1002, String nim_1002, String prodi_1002){
		this.nama_1002 = nama_1002;
		this.nim_1002 = nim_1002;
		this.prodi_1002 = prodi_1002;
	}
	
	public String getNama_1002() { return nama_1002; }
	public String getNim_1002() { return nim_1002; }
	public String getProdi_1002() { return prodi_1002; }
	
	public void setNama_1002(String nama_1002) { this.nama_1002 = nama_1002; }
	public void setNim_1002(String nim_1002) { this.nim_1002 = nim_1002; }
	public void setProdi_1002(String prodi_1002) { this.prodi_1002 = prodi_1002; }
	
	@Override
	public String toString() { return nama_1002; }
}
