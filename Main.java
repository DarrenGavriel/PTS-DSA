public class Main {

	public static void main(String[] args) {
		MyLinkedList coba = new MyLinkedList();
		coba.add(new Node(new Data("urutan 1", 123), null, null));
		coba.add(new Node(new Data("urutan 2", 456), null, null));
		coba.add(new Node(new Data("urutan 3", 789), null, null));
		coba.add(new Node(new Data("urutan 4", 111), null, null));
		coba.add(new Node(new Data("urutan 5", 222), null, null));
		coba.add(new Node(new Data("ini tambah tengah", 999), null, null), "urutan 3");
		coba.cetaklist();
		System.out.println();

		MyLinkedList l2 = new MyLinkedList();
		l2.add(new Node (new Data("ariana", 101), null, null));
		l2.add(new Node (new Data("bryan", 102), null, null));
		
		coba.merge(l2);
		coba.cetaklist();
		System.out.println();
		coba.cetaklist_akhir();
		coba.findData("ariana");
	}
}
