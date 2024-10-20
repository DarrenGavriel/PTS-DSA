//KELAS PLAYLIST
public class Playlist {
	private Node head, tail, posisi;
	
	public void addHead(Node baru){
	        if(head==null){
	            head=baru;
	            tail=baru;
	        }
	        else{
	            baru.setNext(head);
	            head.setPrev(baru);
	            head=baru;
	        }
	}
		
	public void addMid(Node baru, String setelah){
		boolean status = true;
		if (head == null) {
			addHead(baru);
		}
		else {
			if(tail.getData().getJudulLagu().equals(setelah)) {
				addTail(baru);
				status = false;
			}
			else {
				Node temp = head;
				while(temp != null) {
					if(temp.getData().getJudulLagu().equals(setelah)) {
						status = false;
						break;
					}
					temp = temp.getNext();
				}
				if (temp != null) {
					temp.getNext().setPrev(baru);
					baru.setPrev(temp);
					baru.setNext(temp.getNext());
				temp.setNext(baru);
				}
			}
		}
		if (status) {
			System.out.println(setelah + " Judul tidak ditemukan, akan ditambahkan di depan");
			System.out.println();
			addHead(baru);
		}
	}
	public void addTail(Node baru) {
		if(tail==null) {
			tail=baru;
			head=baru;
		}
		else {
			baru.setPrev(tail);
			tail.setNext(baru);
			tail=baru;
		}
	}
	public void deleteHead() {
		if (head == null) {
			System.out.println("Data kosong");
		}
		else {
			Node hapus = head;
			head = head.getNext();
			head.setPrev(null);
			hapus = null;
		}
	}
	public void deleteMid(String judulLagu) {
		Node temp = head;
		if (head.getData().getJudulLagu().equals(judulLagu)) {
			deleteHead();
		}
		else if(tail.getData().getJudulLagu().equals(judulLagu)) {
			deleteTail();
		}
		while (temp != null) {
			if(temp.getNext() == null) {
				System.out.println("data rk nemu");
				break;
			}
			else if (temp.getNext().getData().getJudulLagu().equals(judulLagu)) {
				Node hapus = temp.getNext();
				temp.setNext(hapus.getNext());
				hapus.getNext().setPrev(temp);
				hapus = null;
				break;
			}
			temp = temp.getNext();
			
		}	
		
	public void deleteTail() {
		if (tail == null) {
			System.out.println("data kosong");
		}
		else {
			Node hapus = tail;
			tail = tail.getPrev();
			tail.setNext(null);
			hapus = null;
		}
	}
		
	public void hapus_all() {
		head = null;
		tail = null;
	}
	
	public void merge(Playlist l2) {
		if(this.head == null || l2.head == null) {
			return;
		}
		this.tail.setNext(l2.head);
		l2.head.setPrev(this.tail);
		this.tail = l2.tail;
		l2.head = this.head;
	}
		
	public int hitung() {
		int jumlah = 0;
		Node temp = head;
		while(temp != null) {
			jumlah++;
			temp.getNext();
		}
		return jumlah;
	}
	
	public void play() {
		if(hitung() == 0) {
			System.out.println("Playlist kosong");
		}
		else {
			posisi = head;
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
	
	public void findData(int durasi) { // penjelasan bagian method ini sama dengan method findData(String data) , hanya saja string diubah ke int
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
		int checkDataToMove=0;
		while(temp!=null) {
			if(temp.getTitle()==movedata){ // jika title itu sama dengan movedata (untuk data yang mau diubah posisinya)
				System.out.print("Data that will be moved:" + movedata + "\n");
				dataToMove=temp; //temp (posisi data yang ada di temp, itu dimasukan kedalam dataToMove 
				checkDataToMove++;
				break;
			}
			else {
				temp=temp.getNext();
			}
		}
		
		int checkDataAfter=0;
		temp=head; // mendeklarasikan temp baru agar isi temp ter-reset kembali ke head awal
		while(temp!=null) {
			if(temp.getTitle()==dataafter) {// jika title adalah dataafter(lokasi dimana movedata akan diletakkan setelah dataafter)
				afterNode=temp; //temp dari posisi title == dataafter akan dimasukkan ke dalam afterNode
				checkDataAfter++;
				break;
			}
			else {
				temp=temp.getNext();
			}
		}
		
		if(checkDataToMove==0 && checkDataAfter==0) {
			System.out.println("Kedua Data tidak ditemukan");
			return;
		}
		else if(checkDataToMove==0) {
			System.out.println("Data untuk dipindah tidak ditemukan");
			return;
		}
		else if(checkDataAfter==0) {
			System.out.println("tempat pindah data tidak ditemukan");
			return;
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
	public void cetaklist(){ // cetak dari head
	        Node temp = head;
	        System.out.println("HEADNYA:"); 
	        head.cetak();
	        System.out.println("TAILNYA:"); 
	        tail.cetak();
	        System.out.println("\n");
	        while(temp != null){
	            temp.cetak();
	            temp = temp.getNext();
		}
	}
	public void cetaklist_akhir(){ // Cetak dari tail
	        Node temp = tail;
	        System.out.println("HEADNYA:"); 
	        head.cetak();
	        System.out.println("TAILNYA:"); 
	        tail.cetak();
	        while(temp != null){
	            temp.cetak();
	            temp = temp.getPrev();
	        }
	}
}
