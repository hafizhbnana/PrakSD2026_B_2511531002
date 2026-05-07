package pekan5_2511531002;

public class Pasien_2511531002 {
	String namaPasien_1002;
	String penyakit_1002;
	int antrian_1002;
	Pasien_2511531002 next_1002;
	
	// CONSTRUCTOR
	public Pasien_2511531002(String namaPasien_1002, String penyakit_1002, int antrian_1002) {
		this.namaPasien_1002 = namaPasien_1002;
		this.penyakit_1002 = penyakit_1002;
		this.antrian_1002 = antrian_1002;
		this.next_1002 = null;
	}
	
	// GETTER
	public String getNamaPasien_1002() {
		return namaPasien_1002; }
	public String getPenyakit_1002() {
		return penyakit_1002; }
	public int getAntrian_1002() {
		return antrian_1002; }
	public Pasien_2511531002 getNext_1002() {
		return next_1002; }
	
	// SETTER
	public void setNamaPasien_1002(String namaPasien_1002) {
		this.namaPasien_1002 = namaPasien_1002; }
	public void setPenyakit_1002(String penyakit_1002) {
		this.penyakit_1002 = penyakit_1002; }
	public void setAntrian_1002(int antrian_1002) {
		this.antrian_1002 = antrian_1002; }
	public void setNext_1002(Pasien_2511531002 next_1002) {
		this.next_1002 = next_1002; }
}
