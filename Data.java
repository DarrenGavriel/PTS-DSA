KELAS DATA
public class Data {
	private String judulLagu, penyanyiLagu;
	private int durasiLagu, tahunRilis;
	public Data() {

	}
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
        System.out.println(judulLagu + ", "+ penyanyiLagu+", "+ durasiLagu +" ,"+ tahunRilis); 
    }
}

