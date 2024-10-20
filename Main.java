
KELAS MAIN
public class Main {

	public static void main(String[] args) {
		Playlist coba = new Playlist();
		coba.addHead(new Node(new Data("Like that", "Metro Boomin", 267, 2020), null, null));
		coba.addHead(new Node(new Data("Superhero", "Metro Boomin", 182, 2021), null, null));
		coba.addHead(new Node(new Data("LILAC", "IU", 214, 2019), null, null));
		coba.addTail(new Node(new Data("Starlight", "Dave", 212, 2022), null, null));
		coba.addTail(new Node(new Data("Eight", "IU", 167, 2019), null, null));
		coba.addMid(new Node(new Data("Reckless", "Madison Beer", 203, 2022), null, null), "Like ");
		coba.addTail(new Node(new Data("Cookie", "NewJeans", 200, 2021), null, null));
		coba.addMid(new Node(new Data("Celebrity", "IU", 242, 2019), null, null), "Starlight");
        
		coba.cetaklist();// ini list asli
		System.out.println();

		Playlist l2 = new Playlist();
		l2.addHead(new Node (new Data("Mask Off", "Future", 204, 2017), null, null));
		l2.addHead(new Node (new Data("Tore Up", "Don Toliver", 126, 2021), null, null));
		l2.addTail(new Node (new Data("HOT", "Seventeen", 154, 2023), null, null));
		System.out.println();
		
		l2.cetaklist();// ini print l2
		l2.merge(coba);
		System.out.println();
		
		l2.cetaklist();// hasil merge sama l2
		System.out.println();
	}
}
