/**********************
* Author: Gracia
* Date: 17 - Oktober - 2024
* Modified date : 20-Oktober-2024 (by : Gracia)
* Filename: Main.java
* Description: Class main ini untuk menjalankan semua method yang terdapat di class Data.java, Node.java, dan Playlist.java
**********************/

public class Main {
	public static void main(String[] args) {
		System.out.println("ANGGOTA KELOMPOK:");
		System.out.println("Njo, Darren Gavriel Vankalino Santoso - 23.K1.0011");
		System.out.println("Jordan Theovandy - 23.K1.0018");
		System.out.println("Darlene Angelina Christy - 23.K1.0041");
		System.out.println("Indivara Nanda - 23.K1.0063");
		System.out.println("Gracia Valentine A.M - 23.K3.0014");

		
		Playlist playlist_1 = new Playlist();
        	System.out.println(" ~ Playlist Lagu ~ ");
        
       		// Membuat format header
        	String headerFormat = "| %-15s | %-15s | %-6s | %-5s |%n"; 
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
		
		playlist_2.cetaklist();// ini print playlist_2
		//Merge - Darren
		playlist_1.merge_back(playlist_2);
		System.out.println();
		playlist_1.cetaklist();// hasil merge dengan playlist_2
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

        // Cetak daftar lagu setelah diubah
        System.out.println("\nDaftar lagu setelah diubah:");
        playlist_1.cetaklist();
	System.out.println();
        // Play musik - Darren
        System.out.println("Kita akan play lagu dari head");
        System.out.println();
        playlist_1.playAtFront();
	playlist_1.play_next();
	playlist_1.play_next();
        playlist_1.play_prev();
        System.out.println();
	
        System.out.println("kita akan play lagu dari tail");
        System.out.println();
        playlist_1.playAtLast();
        playlist_1.play_prev();
        playlist_1.play_prev();
        playlist_1.play_prev();
        playlist_1.play_next();
	}
}


