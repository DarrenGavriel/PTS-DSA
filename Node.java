package coba;

public class Node {
		private String judul, penyanyi;
		private int durasi;
		private Node next, prev;
		
		public Node() {
			judul = " ";
			penyanyi=" ";
			durasi= 0;
			next=null;
			prev=null;
		}
		
		public Node(String j, String p, int d, Node n, Node pr) {
			judul = j;
			penyanyi = p;
			durasi = d;
			next = n;
			prev = pr;	
		}
		
		public void setJudul(String j) {
			judul = j;
		}
		public void setPenyanyi(String p) {
			penyanyi = p;
		}
		public void setDurasi(int d) {
			durasi = d;
		}
		public void setNext(Node n) {
			next = n;
		}
		public void setPrev(Node p) {
			prev = p;
		}
		
		public String getJudul() {
			return judul;
		}
		public String getPenyanyi() {
			return penyanyi;
		}
		public int getDurasi() {
			return durasi;
		}
		public Node getNext() {
			return next;
		}
		public Node getPrev() {
			return prev;
		}
		
		public void cetak() {			
			String format="%-20s %-25s %-3ds %n";
			System.out.format(format, judul, penyanyi, durasi);
		}
}


