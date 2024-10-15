public class Data {
	private String nama;
	private int tahun;
	
	Data (String nama, int tahun){
		setNama(nama);
		setTahun(tahun);
	}
	// ini buat setter nama
	public void setNama(String nama) {
		this.nama = nama;
	}
	// ini buat 
	public String getNama() {
		return nama;
	}
	public void setTahun(int tahun) {
		this.tahun = tahun;
	}
	public int getTahun() {
		return tahun;
	}
	public void cetakData() {
        System.out.println(nama + ", "+ tahun); 
    }
}
