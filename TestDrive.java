package cobawen;

public class TestDrive {
	public static void main(String[]args) {
		LinkedList ll = new LinkedList();
		ll.add(new Node("Bohemian Rhapsody","Queen", 300,null,null),"BACK");
		ll.add(new Node("Melted","AKMU",350,null,null),"frONt");
		ll.add(new Node("Roly Poly","T-Ara", 400, null, null),"BAck");
		ll.add(new Node("Reality", "AKMU",500, null, null),"back");
		
		System.out.println("List Awal:\n");
		ll.printList();
		
		System.out.println("\n\nCETAK BELAKANG:");
		ll.printBehind();
		
		ll.add("Roly Poly",new Node("Night Changes", "One Direction", 300, null, null));
		
		System.out.println("\n\nADD IN THE MIDDLE: ");
		ll.printList();
		
		System.out.println("\n\nPRINT FROM BEHIND");
		ll.printBehind();

		//Mencari lagu berdasarkan penyanyi
		System.out.println("\n\n");
		ll.findData("AKMU");
		//Mencari lagu berdasarkan judul lagu
		System.out.println("\n");
		ll.findData("Nxde");
		//Mencari data lagu berdasarkan durasi lagu
		System.out.println("\n");
		ll.findData(300);
		
		System.out.println("\n");
		ll.moveData("Night Changes", "Bohemian Rhapsody");
		ll.printList();
		
		System.out.println("\nRemoving Data Head or Tail or Middle:");
		ll.remove("depan");
		ll.remove("Roly Poly");
		ll.remove("tail");
		ll.printList();
		
		
	}
}
