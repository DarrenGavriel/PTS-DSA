
//KODINGAN DARREN x VARA YG BARU

KELAS NODE
public class Node {
	private Node next, prev;
	private Data data;
	public Node() {
		data = null;
		next = null;
		prev = null;
	}
	public Node(Data d, Node n, Node p) {
		next = n;
		prev = p;
		data = d;
	}
	public void setNext(Node n) {
		next = n;
	}
	public Node getNext() {
		return next;
	}
	public void setPrev(Node p) {
		prev = p;
	}
	public Node getPrev() {
		return prev;
	}
	public void setData(Data d) {
		data = d;
	}
	public Data getData() {
		return data;
	}
	// untuk mencetak data dari memanggil metode cetak data melalui referense data
	public void cetak() {
		data.cetakData();	
	}
}
