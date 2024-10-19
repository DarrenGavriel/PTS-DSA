public class Data {
	private String judul, penyanyi;
	private int detik;
	public Data() {

	}
	Data (String Judul, String penyanyi, int detik){
		setJudul(Judul);
		setDetik(detik);
		setPenyanyi(penyanyi);
	}
	public void setJudul(String judul) {
		this.judul = judul;
	} 
	public String getJudul() {
		return judul;
	}
	public void setDetik(int detik) {
		this.detik = detik;
	}
	public int getTahun() {
		return detik;
	}
	public void setPenyanyi(String penyanyi) {
		this.penyanyi = penyanyi;
	}
	public String getPenyanyi() {
		return penyanyi;
	}
	public void cetakData() {
        System.out.println(judul + ", "+ penyanyi+", "+ detik); 
    }
}
