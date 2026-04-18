package pekan3_2511531002;

public class Website_2511531002 {
	private String judul_1002;
	private String url_1002;
	
	public Website_2511531002(String judul_1002, String url_1002) {
		this.judul_1002 = judul_1002;
		this.url_1002 = url_1002;
	}
	
	public String getJudul_1002() { return judul_1002; }
	public String getUrl_1002() { return url_1002; }
	
	public void setJudul_1002(String judul_1002) { this.judul_1002 = judul_1002; }
	public void setUrl_1002(String url_1002) { this.url_1002 = url_1002; }
	
	@Override
	public String toString() {
		return "Judul : " + judul_1002 + "\nURL   : " + url_1002;
	}
}
