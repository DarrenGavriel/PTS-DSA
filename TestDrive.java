package coba;

public class TestDrive {
		public static void main(String[]args) {
			LinkedList ll = new LinkedList();
			ll.addHead(new Node("Bohemian Rhapsody","Queen", 300,null,null));
			ll.addHead(new Node("Melted","AKMU",350,null,null));
			ll.addTail(new Node("Roly Poly","T-Ara",250,null,null));
			ll.addTail(new Node("Rewrite The Stars","James Arthur & Anne Marie",400,null,null));
			
			System.out.println("List Awal:\n");
			ll.cetakList();
			
			System.out.println("\n\nCETAK BELAKANG:");
			ll.cetakBelakang();
			
			ll.addMid("Melted", new Node("Nxde","G-Idle",250,null,null));
			ll.addMid("Roly Poly", new Node("In The End","Linkin Park",450,null,null));
			ll.addMid("Bohemian Rhapsody", new Node("MAGO","G-Friend",200,null,null));
			
			System.out.println("\n\nList Tambah Tengah:");
			ll.cetakList();
			
			System.out.println("\n\nCETAK BELAKANG:");
			ll.cetakBelakang();
			
			System.out.println("\n\nList Hapus Head:");
			ll.removeHead();
			ll.cetakList();
			
			System.out.println("\n\nList Hapus Tail:");
			ll.removeTail();
			ll.cetakList();
			
			System.out.println("\n\nList Hapus Tengah:");
			ll.removeMid("Rewrite The Stars");
			ll.cetakList();
			
			System.out.println("\n\nList setelah hapus tengah:");
			ll.cetakBelakang();
			
			
		}
}
