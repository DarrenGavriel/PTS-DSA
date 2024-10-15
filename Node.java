public class Node {
	private Node next;
	private Data data;
	public Node(Data d, Node n) {
		next = n;
		data = d;
	}
	public void setNext(Node n) {
		next = n;
	}
	public Node getNext() {
		return next;
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
