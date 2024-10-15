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
	public void nambah_tengah(Node baru, String setelah) {
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
	public void rm_mid(String judul) {
		Node temp = head;
		while (temp != null) {
			if(temp.getNext() == null) {
				System.out.println("data rk nemu");
				break;
			}
			else if (temp.getNext().getData().getNama().equals(judul)) {
				break;
			}
			temp = temp.getNext();
		}
		Node hapus = temp.getNext();
		temp.setNext(hapus.getNext());
		hapus.getNext().setPrev(temp);
		hapus = null;
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
