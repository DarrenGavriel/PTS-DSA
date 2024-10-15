package coba;

public class LinkedList {
		Node head, hapus, tail;
		
		public LinkedList() {
			head=null;
			tail = null;
		}
		
		public void addHead(Node baru) {
			if(head==null) {
				head=baru;
				tail=baru;
			}
			else {
				baru.setNext(head);
				head.setPrev(baru);
				head=baru;
			}		
		}
		
		public void addTail(Node baru) {
			if(head==null) {
				head=baru;
				tail=baru;
			}
			else {
				tail.setNext(baru);
				baru.setPrev(tail);
				tail=baru;
			}
		}
		
		public void addMid(String judul, Node baru) {
			if(head==null) {
				head=baru;
				tail=baru;
			}
			else {
				Node temp=head;
				while(temp!=null) {
					if(temp.getJudul()!=judul) {
						temp=temp.getNext();
					}
					else {
						break;
					}
				}
				baru.setPrev(temp);
				baru.setNext(temp.getNext());
				temp.getNext().setPrev(baru);
				temp.setNext(baru);
				
			}
		}
		
		public void removeHead() {
			hapus = head;
			head = head.getNext();
			head.setPrev(null);
			hapus=null;
		}
		
		public void removeTail() {
			Node temp=head;
			while(temp.getNext().getNext()!=null) {
				temp=temp.getNext();
			}
			hapus=tail;
			tail=tail.getPrev();
			temp.setNext(null);
			hapus=null;
			
//			hapus=tail;
//			tail=tail.getPrev();
//			tail.setNext(null);
//			hapus=null;
		}
		
		public void removeMid(String judul) {
			Node temp=head;
			while(temp!=null) {
				if(temp.getNext().getJudul()!=judul) {
					temp=temp.getNext();
				}
				else {
					break;
				}
			}
				hapus=temp.getNext();
				temp.setNext(hapus.getNext());
				hapus.getNext().setPrev(temp);
				hapus=null;
		}
		
		public void cariPenyanyi(String data) {
			System.out.printf(data);
			System.out.println("\n");
			Node temp=head;
			while(temp!=null) {
				if(temp.getPenyanyi()==data || temp.getJudul()==data) {
					temp.cetak();
				}
				temp=temp.getNext();
			}
		}
		
		public void cetakList() {
			Node temp=head;
			while(temp!=null) {
				temp.cetak();
				temp=temp.getNext();
			}
		}
		
		public void cetakBelakang() {
			Node temp=tail;
			while(temp!=null) {
				temp.cetak();
				temp=temp.getPrev();
			}
		}
}
