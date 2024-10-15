public class Main {

	public static void main(String[] args) {
		MyLinkedList coba = new MyLinkedList();
		coba.add(new Node(new Data("urutan 1", 123), null));
		coba.add(new Node(new Data("urutan 2", 456), null));
		coba.add(new Node(new Data("urutan 3", 789), null));
		coba.nambah_tengah(new Node(new Data("ini tambah tengah", 999), null), "urutan 2");
		coba.cetaklist();
	}
}
