public class Main {

	public static void main(String[] args) {
		Playlist coba = new Playlist();
		coba.add(new Node(new Data("Like that", "Metro Boomin", 267), null, null));
		coba.add(new Node(new Data("Superhero", "Metro Boomin", 182), null, null));
		coba.add(new Node(new Data("LILAC", "IU", 214), null, null));
		coba.add(new Node(new Data("Starlight", "Dave", 212), null, null));
		coba.add(new Node(new Data("Eight", "IU", 167), null, null));
//		coba.add(new Node(new Data("Reckless", "Madison Beer", 203), null, null), "Like ");
		coba.add(new Node(new Data("Cookie", "NewJeans", 200), null, null));
		coba.add(new Node(new Data("Celebrity", "IU", 242), null, null), "Starlight");

		coba.cetaklist();// ini list asli
		System.out.println();

		Playlist l2 = new Playlist();
		l2.add(new Node (new Data("Mask Off", "Future", 204), null, null));
		l2.add(new Node (new Data("Tore Up", "Don Toliver", 126), null, null));
		
		l2.cetaklist();// ini print l2
		l2.merge(coba);
		System.out.println();
		l2.cetaklist();// hasil merge sama l2
		System.out.println();
	}
}
