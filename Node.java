package cobawen;

public class Node {
	private String title, singer;
	private int duration;
	private Node next, prev;
	
	public Node() {
		title = " ";
		singer =" ";
		duration = 0;
		next=null;
		prev=null;
	}
	
	public Node(String t, String s, int d, Node n, Node pr) {
		title = t;
		singer = s;
		duration = d;
		next = n;
		prev = pr;	
	}
	
	public void setTitle(String t) {
		title = t;
	}
	public void setSinger(String s) {
		singer = s;
	}
	public void setDuration(int d) {
		duration = d;
	}
	public void setNext(Node n) {
		next = n;
	}
	public void setPrev(Node p) {
		prev = p;
	}
	
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public int getDuration() {
		return duration;
	}
	public Node getNext() {
		return next;
	}
	public Node getPrev() {
		return prev;
	}
	
	public void print() {			
		String format="%-20s %-28s %-3ds %n";
		System.out.format(format, title, singer, duration);
	}
}



