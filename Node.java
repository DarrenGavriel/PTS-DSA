public class Node {
    private Node next;
    private Node prev;
    private Data data;

    public Node() {
        next = null;
        prev = null;
        data = null;
    }

    public Node(Data d,Node n,Node p){
        data = d;
        next = n;
        prev = p;
    }

    public void setNext(Node n){
        next = n;
    }
    public Node getNext(){
        return next;
    }

    public void setPrev(Node p){
        prev = p;
    }
        public Node getPrev(){
        return prev;
    }

    public void setData(Data d){
        data = d;
    }
    public Data getData(){
        return data;
    }

    public void cetak(){
        data.cetakData();
    }


}
