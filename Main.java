public class Main {
    public static void main(String[] args) {
        MyLinkedList coba = new MyLinkedList();
        System.out.println(" ~ Playlist Lagu ~ ");
        
        // Membuat format header
        String headerFormat = "| %-15s | %-15s | %-6s | %-5s |%n"; 
        System.out.format(headerFormat, "Judul Lagu", "Penyanyi", "Tahun", "Durasi Lagu"); 
        
        // Menambahkan node baru
        coba.add(new Node(new Data("Mine", "Taylor Swift", 1234, 100),null,null));
        coba.add(new Node(new Data("Hello", "Adele", 5678, 200),null,null));
        coba.add(new Node(new Data("Baby", "Justin Bieber", 9101, 300),null,null));
        coba.add(new Node(new Data("Wolf", "Selena Gomez", 1213, 400),null,null));
        coba.add(new Node(new Data("EternalSunshine", "Ariana Grande", 1415, 500),null,null));

        //cetak dari head
		coba.cetaklist();
		System.out.println();

        // Mengedit judul lagu
        String singer = "Ariana Grande";
        String titleBaru = "Intro";
        coba.editJudulLagu(singer, titleBaru); 
        
        // Cetak daftar lagu setelah diubah
        System.out.println("\nDaftar lagu setelah diubah:");
        coba.cetaklist();
    }
}