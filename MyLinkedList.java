public class MyLinkedList{
    Node head, tail;

    public MyLinkedList(){
        head = null;
    }

    public void addHead(Node baru){
        if (head == null){ //kalau listnya null/kosong nanti head sm tailnya isinya node baru
            head = baru;
            tail = baru;
        }else{
            //buat naruh paling depan(head)
            baru.setNext(head); // node skrg(baru) di sambungin dulu ke head(node baru-->head)
            head = baru;
        }
    }

    public void addTail(Node baru){
        if (tail == null){
            head = baru;
            tail = baru;
        }else{
            tail.setNext(baru); // node skrg(tail) di sambungin dulu ke node baru krn kita mau addtail(tail->node baru)
            tail = baru;
        }
    }

    public void deleteHead() {
        if (head !=null){ //kalau list headnya ga null(kosong) nanti headnya bakal di pindah ke list brktnya alias head yg skrg nanti ke apus dan headnya udah ga sama lagi
            head = head.getNext(); //headnya nanti bakal ke replace sama node berikutnya
        }
    }

    public void deleteTail(){
        if (head == null){
            return;
        }
       
        if (head.getNext() == null){
            head = null;
            return;
        }
       
        Node temp = head;
        while (temp.getNext().getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(null);
        tail=temp;
    }


    public void cetakList() {
        Node temp = head;
        System.out.print("HEADNYA ADALAH: \n");
        head.cetak(); //buat cetak head
        System.out.print("\n");
       
        //temp = tail;
        //System.out.print("TAILNYA ADALAH: \n");
        //tail.cetak();
        //System.out.print("\n");
       
        while(temp !=null){
            temp.cetak(); //buat cetak semua list nya
            temp=temp.getNext();  
        }
       
         System.out.print("\n");
         
        Node rawr = tail;
        System.out.print("TAILNYA ADALAH: \n");
        tail.cetak();
        System.out.print("\n");
       
        while(rawr !=null){
            //rawr.cetak();
            rawr=rawr.getNext();  
        }
       
        //System.out.print("\n");
       
    }
}
   
    //public void cetakTail() {
        //Node rawr = tail;
        //System.out.print("TAILNYA ADALAH: \n");
        //tail.cetak();
        //System.out.print("\n");
       
        //while(rawr !=null){
            //rawr.cetak();
            //rawr=rawr.getNext();  
        //}
       
         //System.out.print("\n");
       
    //}
//}

