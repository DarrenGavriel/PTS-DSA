public class MyLinkedList {
	private Node head;
	//nambah node baru kedalam linkedlist
	public void add(Node baru){
        if(head==null){
            head=baru;
            //tail=baru;
        }
        else{
            baru.setNext(head);
            head.setPrev(baru);
            head=baru;
        }
    }

    //tambah tengah
    public void tambahTengah(Node baru, String after) {
		if (head == null) {
			add(baru);
		}
		else {
			Node temp = head;
			while(temp != null) {
				if(temp.getData().getSinger().equals(after)) {
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
	//apus tengah
	public void hapusTengah(String title) {
		Node temp = head;
		while (temp != null) {
			if(temp.getNext() == null) {
				System.out.println("Data Tidak Ditemukan");
				break;
			}
			else if (temp.getNext().getData().getSinger().equals(title)) {
				break;
			}
			temp = temp.getNext();
		}
		Node hapus = temp.getNext();
		temp.setNext(hapus.getNext());
		hapus.getNext().setPrev(temp);
		hapus = null;
    }

        //edit
	public void editJudulLagu(String singer, String titleBaru) {
		Node temp = head; // nyari dari head
		int found = 0; // nandain kalo ketemu apa ga
	
		// Mencari node yang sesuai dengan nama penyanyi
		while (temp != null) {
			if (temp.getData().getSinger().equals(singer)) {
				// kalo dah ketemu penyanyinya nanti judulnya di ubah
				temp.getData().setTitle(titleBaru);
				found ++; // nandain kalo penyanyinya dah ketemu
				break;
			}
			temp = temp.getNext();
		}
	
		// ini kalo g ketemu nanti di kasi keterangan
		if (found==0) {
			System.out.println("Lagu dari penyanyi " + singer + " tidak ditemukan.");
		}
	}

	//method untuk mencetak linkedlist
	public void cetaklist(){
        Node temp = head;
        while(temp != null){
            temp.cetak();
            temp = temp.getNext();
        }
	}
}