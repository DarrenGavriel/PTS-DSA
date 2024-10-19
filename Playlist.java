public class Playlist {
	private Node head, tail, posisi;
	public void add(Node baru){
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
	public void hapus_coba() {
		Node hapus = head;
		hapus = null;
	}
		
	public void add(Node baru, String setelah){
		boolean status = true;
		if (head == null) {
			add(baru);
		}
		else {
			if(tail.getData().getJudul().equals(setelah)) {
				add_belakang(baru);
				status = false;
			}
			else {
				Node temp = head;
				while(temp != null) {
					if(temp.getData().getJudul().equals(setelah)) {
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
			add(baru);
		}
    }
	public void add_belakang(Node baru) {
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
	public void hapus() {
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
	public void hapus(String judul) {
		Node temp = head;
		if (head.getData().getJudul().equals(judul)) {
			hapus();
		}
		else if(tail.getData().getJudul().equals(judul)) {
			hapus_akhir();
		}
		while (temp != null) {
			if(temp.getNext() == null) {
				System.out.println("data rk nemu");
				break;
			}
			else if (temp.getNext().getData().getJudul().equals(judul)) {
				Node hapus = temp.getNext();
				temp.setNext(hapus.getNext());
				hapus.getNext().setPrev(temp);
				hapus = null;
				break;
			}
			temp = temp.getNext();
		}
	}
	public void hapus_akhir() {
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

	public void cetaklist(){ // cetak dari head
        Node temp = head;
        while(temp != null){
            temp.cetak();
            temp = temp.getNext();
        }
	}
	public void cetaklist_akhir(){ // Cetak dari tail
        Node temp = tail;
        while(temp != null){
            temp.cetak();
            temp = temp.getPrev();
        }
	}
}
