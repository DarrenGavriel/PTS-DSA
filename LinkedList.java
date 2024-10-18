package cobawen;

public class LinkedList {
	Node head, delete, tail;
	
	public LinkedList() {
		head=null;
		tail = null;
	}
	
	public void add(Node newNode, String position) {
		if(position.equalsIgnoreCase("front") || position.equalsIgnoreCase("depan")) {
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				newNode.setNext(head);
				head.setPrev(newNode);
				head=newNode;
			}
		}
		else if(position.equalsIgnoreCase("back") || position.equalsIgnoreCase("belakang")) {
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.setNext(newNode);
				newNode.setPrev(tail);
				tail=newNode;
			}
		
		}
	}
	
	public void add(String title, Node newNode) {
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			Node temp=head;
			while(temp!=null) {
				if(temp.getTitle()!=title) {
					temp=temp.getNext();
				}
				else {
					break;
				}
			}
			newNode.setPrev(temp);
			newNode.setNext(temp.getNext());
			temp.getNext().setPrev(newNode);
			temp.setNext(newNode);
			
		}
	}
	
	public void remove(String position) {
		if(position.equalsIgnoreCase("head") || position.equalsIgnoreCase("depan")) {
			delete = head;
			head = head.getNext();
			head.setPrev(null);
			delete=null;
		}
		else if(position.equalsIgnoreCase("tail") || position.equalsIgnoreCase("belakang")) {
			Node temp=head;
			while(temp.getNext().getNext()!=null) {
				temp=temp.getNext();
			}
			delete=tail;
			tail=tail.getPrev();
			temp.setNext(null);
			delete=null;
		}
		else {
			Node temp=head;
			while(temp!=null) {
				if(temp.getNext().getTitle()!=position) {
					temp=temp.getNext();
				}
				else {
					break;
				}
			}
				delete=temp.getNext();
				temp.setNext(delete.getNext());
				delete.getNext().setPrev(temp);
				delete=null;
		}
		
	}
	
	public void findData(String data) {
		int find=0; //digunakan untuk mencari apakah data itu ditemukan dalam list atau tidak, membuat variable baru untuk nantinya dipanggil menggunakan if
		System.out.printf("Mencari data: " + data + "\n");
		Node temp=head;
		while(temp!=null) {
			if(temp.getSinger()==data || temp.getTitle()==data) { // untuk membandingkan, || artinya OR/ATAU. jika antara singer atau title ada yang sama dengan data
				find=find+1; //menambahkan isi variabel "find" +1 untuk memberikan indikasi jika data tersebut ada
				temp.print();
			}
			temp=temp.getNext();
		}
		if(find==0) { // untuk mencari apakah data itu ada atau tidak, jika ada maka "find" pasti bernilai > 0
			System.out.println("-------- " + data + " tidak ditemukan");
		}
	}
	
	public void findData(int durasi) {
		System.out.println("Mencari berdasarkan durasi: " + durasi + "\n");
		int find=0;
		Node temp=head;
		while(temp!=null) {
			if(temp.getDuration()==durasi) {
				temp.print();
				find++;
			}
			temp=temp.getNext();
		}
		if(find==0) {
			System.out.println("-------- Durasi " + durasi + " tidak ditemukan");
		}
	}
	
	
	public void moveData(String movedata, String dataafter) {
		Node temp=head; 
		Node dataToMove=null; //membuat Node baru untuk menyimpan sementara 
		Node afterNode=null; // sama kayak atasnya
		while(temp!=null) {
			if(temp.getTitle()==movedata){ // jika title itu sama dengan movedata (untuk data yang mau diubah posisinya)
				System.out.print("Data that will be moved:" + movedata + "\n");
				dataToMove=temp; //temp (posisi data yang ada di temp, itu dimasukan kedalam dataToMove 
				break;
			}
			else {
				temp=temp.getNext();
			}
		}
		temp=head; // mendeklarasikan temp baru agar isi temp ter-reset kembali ke head awal
		while(temp!=null) {
			if(temp.getTitle()==dataafter) {// jika title adalah dataafter(lokasi dimana movedata akan diletakkan setelah dataafter)
				afterNode=temp; //temp dari posisi title == dataafter akan dimasukkan ke dalam afterNode
				break;
			}
			else {
				temp=temp.getNext();
			}
		}
		if(dataToMove.getPrev()!=null) {//dataToMove adalah data yang mau kita pindah, mengecek apakah sebelum dataToMove ada isinya atau tidak
			dataToMove.getPrev().setNext(dataToMove.getNext()); // kalau tidak ada, maka dataToMove sebelumnya di set selanjutnya ke lanjutan dataToMove
		}
		else {
			head=dataToMove.getNext(); // jika tidak ada data sebelum dataToMove, maka head akan diperbarui menjadi data setelah dataToMove karena kita akan memindahkan dataToMove
		}
		
		if(dataToMove.getNext()!=null) {//podo karo atase
			dataToMove.getNext().setPrev(dataToMove.getPrev());
		}
		else {
			tail=dataToMove.getPrev();
		}
		
		dataToMove.setNext(afterNode.getNext());// mengeset data setelah dataToMove menjadi data setelah afterNode 
		dataToMove.setPrev(afterNode); // kemudian, data sebelum dataToMove di set ke afterNode
		afterNode.setNext(dataToMove); // bar kui data sakwise afterNode di sambungke karo dataToMove
		
		if(afterNode.getNext()!=null) { // after that, we need to find if the next data after afterNode is null or no
			afterNode.getNext().setPrev(dataToMove); // if it's not null, then we have to set the next data to the previous data of dataToMove
		}
		else {
			tail=dataToMove;//nek ora ono data sakwise afterNode, yo tail e di ganti dadi dataToMove
		}
		
	}
	
	public void printList() {
		Node temp=head;
		while(temp!=null) {
			temp.print();
			temp=temp.getNext();
		}
	}
	
	public void printBehind() {
		Node temp=tail;
		while(temp!=null) {
			temp.print();
			temp=temp.getPrev();
		}
	}
}

