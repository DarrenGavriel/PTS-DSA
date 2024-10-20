	public class Data { //Semua Kerjain 
	private String judulLagu, penyanyiLagu; 
	private int durasiLagu, tahunRilis;
	public Data() 

	
	Data (String judul, String penyanyi, int durasi, int tahun){ 
		setJudulLagu(judul);
		setDurasiLagu(durasi);
		setPenyanyiLagu(penyanyi);
		setTahunRilis(tahun);
	}
	public void setJudulLagu(String judul) {
		this.judulLagu = judul;
	} 
	public String getJudulLagu() {
		return judulLagu;
	}
	public void setDurasiLagu(int durasi) {
		this.durasiLagu = durasi;
	}
	public int getDurasiLagu() {
		return durasiLagu;
	}
	public void setPenyanyiLagu(String penyanyi) {
		this.penyanyiLagu = penyanyi;
	}
	public String getPenyanyiLagu() {
		return penyanyiLagu;
	}
	public void setTahunRilis(int tahun) {
		this.tahunRilis = tahun;
	}
	public int getTahunRilis() {
		return tahunRilis;
	}
	public void cetakData() {
        System.out.printf("| %-15s | %-15s | %-6d | %-5d detik |%n", getJudulLagu(), getPenyanyiLagu(), getTahunRilis(), getDurasiLagu()); 
    }
}
