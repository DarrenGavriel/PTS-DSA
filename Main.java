public class Main {

	public static void main(String[] args) {
		MyLinkedList coba = new MyLinkedList();
		coba.add(new Node(new Data("urutan 1", 123), null, null));
		coba.add(new Node(new Data("urutan 2", 456), null, null));
		coba.add(new Node(new Data("urutan 3", 789), null, null));
		coba.add(new Node(new Data("urutan 4", 111), null, null));
		coba.add(new Node(new Data("urutan 5", 222), null, null));
		coba.nambah_tengah(new Node(new Data("ini tambah tengah", 999), null, null), "urutan 3");
		coba.nambah_tengah(new Node(new Data("ini tambah tengah lagi", 888), null, null), "urutan 2");
		coba.cetaklist();
		System.out.println();
		coba.rm_mid("urutan ");
		System.out.println("Setelah hapus");
		coba.cetaklist();
		
	}
}
