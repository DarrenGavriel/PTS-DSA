public class MyLinkedList {
	private Node head, tail;
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
	public void add(Node baru, String setelah){
		if (head == null) {
			add(baru);
		}
		else {
			Node temp = head;
			while(temp != null) {
				if(temp.getData().getNama().equals(setelah)) {
					break;
				}
				temp = temp.getNext();
			}
			temp.getNext().setPrev(baru);
			baru.setPrev(temp);
			baru.setNext(temp.getNext());
			temp.setNext(baru);
		}
    }
	public void add_back(Node baru) {
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
		if (head.getData().getNama().equals(judul)) {
			hapus();
		}
		else if(tail.getData().getNama().equals(judul)) {
			hapus_akhir();
		}
		while (temp != null) {
			if(temp.getNext() == null) {
				System.out.println("data rk nemu");
				break;
			}
			else if (temp.getNext().getData().getNama().equals(judul)) {
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
	
	public void merge(MyLinkedList l2) {
		if(this.head == null || l2.head == null) {
			return;
		}
		this.tail.setNext(l2.head);
		l2.head.setPrev(this.tail);
		this.tail = l2.tail;
	}
	
	public void cetaklist(){
        Node temp = head;
        while(temp != null){
            temp.cetak();
            temp = temp.getNext();
        }
	}
	public void cetaklist_akhir(){
        Node temp = tail;
        while(temp != null){
            temp.cetak();
            temp = temp.getPrev();
        }
	}
	
}
