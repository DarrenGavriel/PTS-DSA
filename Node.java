/**********************
	* Author: Jojo
	* Date: 15 - Oktober - 2024
	* Modified date : 20-Oktober-2024 (by : Jojo)
	* Filename: Node.java
	* Description: Class Node ini digunakan untuk menampung Node agat dapat digunakan di doubly Linked list
	**********************/
public class Node {
	private Node next, prev;
	private Data data;
	//konstruktor node di null kan
	public Node(){
		setData(null);
		setNext(null);
		setPrev(null);
	}

	//menambahkan data, next, prev dalam konstruktor node untuk dikirimkan ke setter getter
	public Node(Data data, Node next, Node prev) {
		setData(data);
		setNext(next);
		setPrev(prev);
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
