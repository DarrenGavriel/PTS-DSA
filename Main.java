public class Main {

	public static void main(String[] args) {
	Playlist playlist_1 = new Playlist();
        System.out.println(" ~ Playlist Lagu ~ ");
        
        // Membuat format header
        String headerFormat = "| %-15s | %-15s | %-6s | %-5s |%n"; //blm paham,blm di jelasin jojo
        System.out.format(headerFormat, "Judul Lagu", "Penyanyi", "Tahun", "Durasi"); 
                //ADDHEAD & ADD TAIL -VARA
		playlist_1.addHead(new Node(new Data("Like that", "Metro Boomin", 267, 2020), null, null));
		playlist_1.addHead(new Node(new Data("Superhero", "Metro Boomin", 182, 2021), null, null));
		playlist_1.addHead(new Node(new Data("LILAC", "IU", 214, 2019), null, null));
		playlist_1.addTail(new Node(new Data("Starlight", "Dave", 212, 2022), null, null));
		playlist_1.addTail(new Node(new Data("Eight", "IU", 167, 2019), null, null));
		playlist_1.addMid(new Node(new Data("Reckless", "Madison Beer", 203, 2022), null, null), "Like ");
		playlist_1.addTail(new Node(new Data("Cookie", "NewJeans", 200, 2021), null, null));
		playlist_1.addMid(new Node(new Data("Celebrity", "IU", 242, 2019), null, null), "Starlight");
        
		playlist_1.cetaklist();// ini list asli
		System.out.println();

		Playlist playlist_2 = new Playlist();
		playlist_2.addHead(new Node (new Data("Mask Off", "Future", 204, 2017), null, null));
		playlist_2.addHead(new Node (new Data("Tore Up", "Don Toliver", 126, 2021), null, null));
		playlist_2.addTail(new Node (new Data("HOT", "Seventeen", 154, 2023), null, null));
		System.out.println();
		
		playlist_2.cetaklist();// ini print l2
		playlist_1.merge_back(l2);;
		System.out.println();
		
		playlist_2.cetaklist();// hasil merge sama l2
		System.out.println();
		
		//MENCARI DATA - WEN
		//MENCARI BERDASARKAN PENYANYI/JUDUL LAGU
		playlist_1.findData("IU");
		playlist_1.findData("HOT");
		//MENCARI BERDASARKAN DURASI/TAHUN RILIS
		playlist_1.findData(2020);
		playlist_1.findData(203);
		
		//MEMINDAHKAN DATA 1 KE TEMPAT LAIN - WEN
		System.out.println("\nData sebelum dipindahkan:");
		playlist_1.cetaklist();
		//JIKA KEDUA DATA ADA DI DALAM LIST
		playlist_1.moveData("Mask Off", "Reckless");
		System.out.println("\nData setelah dipindahkan:");
		playlist_1.cetaklist();
		
		//JIKA ADA DATA YANG TIDAK ADA DI DALAM LIST
		playlist_1.moveData("Nxde", "HOT");//NXDE TIDAK ADA DI DALAM LIST
		playlist_1.moveData("Tore Up", "Give Love");//GIVE LOVE TIDAK ADA DI DALAM LIST
		playlist_1.moveData("Nxde", "Give Love");//KEDUA DATA TIDAK ADA DI DALAMLIST
		
		//cetak dari head
		playlist_1.cetaklist();
		System.out.println();

        // Mengedit judul lagu
        String penyanyiLagu = "Madison Beer";
        String judulBaru = "Make You Mine";
        playlist_1.editJudulLagu(penyanyiLagu, judulBaru); 
		playlist_1.playAtFront();
		playlist_1.play_next();
        playlist_1.play_prev();

        // Cetak daftar lagu setelah diubah
        System.out.println("\nDaftar lagu setelah diubah:");
        playlist_1.cetaklist();
	}
}


