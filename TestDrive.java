public class TestDrive{
 public static void main(String args[]){
    MyLinkedList lagu = new MyLinkedList();
    lagu.addHead(new Node("Supernova", "aespa", 2024, 179, null));
    lagu.addHead(new Node("We Don't Talk Anymore", "Charlie Puth", 2015, 218, null));
    lagu.addHead(new Node("OMG", "New Jeans", 2022, 159, null));
    lagu.addTail(new Node("You Right", "Doja Cat & The Weeknd", 2021, 187, null));
    lagu.addTail(new Node("Espresso", "Sabrina Carpenter", 2024, 176, null));
    lagu.addTail(new Node("We Can't Be Friends", "Ariana Grande", 2024, 225, null));
    lagu.addTail(new Node("Eleven", "IVE", 2021, 263, null));
   
   
    //maw tambah lagu
    lagu.addHead(new Node("Boom", "NCT Dream", 2019, 154, null));
    lagu.addTail(new Node("Up", "Karina-aespa", 2024, 167, null));
   
    System.out.print("#SEBELUM HAPUS HEAD# \n");
    lagu.cetakList();
    lagu.deleteHead();
    System.out.print("---------------------------------------------------------------------------------------------\n");
     
    System.out.print("#SESUDAH HAPUS HEAD# \n");
    lagu.cetakList();
    System.out.print("---------------------------------------------------------------------------------------------\n");
     
    System.out.print("#SEBELUM HAPUS TAIL# \n");
    lagu.cetakList();
    lagu.deleteTail();
    System.out.print("---------------------------------------------------------------------------------------------\n");
     
    System.out.print("#SESUDAH HAPUS TAIL# \n");
    lagu.cetakList();
    System.out.print("---------------------------------------------------------------------------------------------\n");
 }
}
