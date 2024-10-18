public class Node{
    private String judulLagu;
    private String penyanyiLagu;
    private int tahunRilis;
    private int durasiLagu;
    private Node next;

    public Node(String judul, String penyanyi, int tahun, int durasi, Node n){
        judulLagu = judul;
        penyanyiLagu = penyanyi;
        tahunRilis = tahun;
        durasiLagu = durasi;
        next = n;
    }

    public void setJudulLagu(String judul){
        judulLagu = judul;
    }

    public String getJudulLagu(){
        return judulLagu;
    }

    public void setPenyanyiLagu(String penyanyi){
        penyanyiLagu = penyanyi;
    }

    public String getPenyanyiLagu(){
        return penyanyiLagu;
    }

    public void setTahunRilis(int tahun){
        tahunRilis = tahun;
    }

    public int getTahunRilis(){
        return tahunRilis;
    }

    public void setDurasiLagu(int durasi){
        durasiLagu = durasi;
    }

    public int getDurasiLagu(){
        return durasiLagu;
    }

    public void setNext(Node n){
        next = n;
    }
   
    public Node getNext(){
        return next;
    }
   
    public void cetak(){
        System.out.println("Judul Lagu: " + judulLagu + ", " + "Penyanyi: " + penyanyiLagu + ", " + "Tahun Rilis: " + tahunRilis + ", " + "Durasi Lagu: " + durasiLagu + " detik ");
        //System.out.println("Penyanyi: " + penyanyiLagu + ",");
        //System.out.println("Tahun Rilis: " + tahunRilis + ",");
        //System.out.println("Durasi Lagu: " + durasiLagu + " detik ");
        //System.out.print("\n");
    }
}
