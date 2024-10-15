public class MyLinkedList {
	private Node head;
	public void add(Node baru){
        if(head==null){
            head=baru;
        }
        else{
            baru.setNext(head);
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
			baru.setNext(temp.getNext());
			temp.setNext(baru);
		}
	}
	public void cetaklist(){
        Node temp = head;
        while(temp != null){
            temp.cetak();
            temp = temp.getNext();
        }
	}
	
}
