package pekan6_2511531002;

public class Lagu_2511531002 {
	private String judul_1002;
	private String penyanyi_1002;
	Lagu_2511531002 next_1002;
	Lagu_2511531002 prev_1002;
	
	// Constructor
	public Lagu_2511531002(String judul_1002, String penyanyi_1002) {
		this.judul_1002 = judul_1002;
		this.penyanyi_1002 = penyanyi_1002;
		this.next_1002 = null;
		this.prev_1002 = null;
	}
	
	// Getter
	public String getJudul_1002() {
		return judul_1002;
	}	
	public String getPenyanyi_1002() {
		return penyanyi_1002;
	}
	
	// Setter
	public void setJudul_1002(String judul_1002) {
		this.judul_1002 = judul_1002;
	}
	public void setPenyanyi_1002(String penyanyi_1002) {
		this.penyanyi_1002 = penyanyi_1002;
	}

}
