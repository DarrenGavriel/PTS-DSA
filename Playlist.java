/**********************
* Author: Darren, Jojo, Vara, Wen, Grace
* Date: 15-October-2024
* Modified date : 20-October-2024 (by : Darren)
* Filename: Playlist.java
* Description: Pada class playlist, terdapat kumpulan method untuk menjalankan doubly linked list, dan ada juga method untuk play lagu
**********************/

public class Playlist {
	private Node head, tail; //vara
	private Node posisi = null; //digunakan untuk mengetahui sampai mana kita memainkan lagu
	
	public void addHead(Node baru){ //untuk nambahin node yg baru (baru) ke head, sebagai node yg pertama. kalau headnya kosong, nanti node yang baru akan menjadi head dan tail
	        if(head==null){ 
	            head=baru;
	            tail=baru;
	        }
	        else{ //kalau headnya ga kosong(udah ada isinya) nanti node baru bakal di set ke node yg skrg(node baru jd head), node baru jadi head-vara
	            baru.setNext(head);
	            head.setPrev(baru);
	            head=baru;
	        }
	}

	/*
	* method's function = untuk menambahkan node ditengah tengah linkedlist
	• [ Created date: 18 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Jordan Theovandy ) ]

	 */
	public void addMid(Node baru, String setelah){
		if (head == null) { //jika head nya kosong maka akan lgsg diarahkan ke addHead
			addHead(baru);
		}
		//menambahkan middle setelah tail atau membuat tail baru
		else if(tail.getData().getJudulLagu().equalsIgnoreCase(setelah)){
			addTail(baru);
		}
		else {
			Node temp = head; //head akan dimasukan ke node temp
			while(temp != null) { //kemudian akan dilakukan while selagi temp tidak kosong
				if(temp.getData().getJudulLagu().equalsIgnoreCase(setelah)) { //kola judul lagu yang berada di temp sama dengan setelah
					break; //maka akan langsung dibreak dan keluar dari loooping while
				}
				temp = temp.getNext(); 
			}
			if (temp != null && temp.getNext() != null) { //jika temp tidak kosong dan node stlh temp tidak kosong juga
				temp.getNext().setPrev(baru); //maka node yang setelah temp referencesnya akan disambungkan ke node baru
				baru.setPrev(temp); //kemudian node baru akan di references kan ke node temp sbg prev
				baru.setNext(temp.getNext()); //node baru akan di next references ke node yang berada di depan node temp
				temp.setNext(baru); //kemudian next references node temp akan disambungkan kepada node baru
			} else{ //jika itu semua tidak berjalan dan tidak ditemukan maka node yang ingin digunakan 'setelah' akan di print tidak ditemukan 
				System.out.println("Node dengan nama '" + setelah + "' tidak ditemukan");
			}
		}
	}
	public void addTail(Node baru) { //untuk nambahin node yg baru (baru) ke tail, sebagai node yg terakhir, kalau tailnya kosong, nanti node baru akan menjadi tail dan head -vara
		if(tail==null) { 
			tail=baru;
			head=baru;
		}
		else { //kalau tailnya tdk kosong node baru akan di set ke tail terlebih dahulu, kalau udh nyambung baru tailnya di sambung ke node yg baru, jd skrg tailnya adalah node yg baru-vara
			baru.setPrev(tail);
			tail.setNext(baru);
			tail=baru; 
		}
	}
	public void deleteHead() { //hapus head, kalau headnya kosong, nanti bakal ke cetak "Data kosong"- vara
		if (head == null) { 
			System.out.println("Data kosong"); 
		}
		else {  //kalau headnya ga kosong, headnya dimasukin ke hapus, headnya jadi node yg setelah head, sambungannya antara head yg sblmny di putusin, krn head yg sblmnya dah masuk di hapus, lalu kita jdiin null biar ilang
			Node hapus = head; 
			head = head.getNext(); 
			head.setPrev(null); 
			hapus = null; 
		}
	}
	/*
	* method's function = untuk menghapus data yang ditengah
	• [ Created date: 15 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Jordan Theovandy ) ]

	 */
	public void deleteMid(String judulLagu) {
		// Jika head yang dihapus
		if (head.getData().getJudulLagu().equalsIgnoreCase(judulLagu)) {
			deleteHead();
			return; // Setelah menghapus, keluar dari metode
		} 
		// Jika tail yang dihapus
		if (tail != null && tail.getData().getJudulLagu().equalsIgnoreCase(judulLagu)) {
			deleteTail();
			return; // Setelah menghapus, keluar dari metode
		}
		
		Node temp = head;
		// Mencari node yang memiliki data dengan nama penyanyi
		while (temp != null && temp.getNext() != null) { //jika temp tidak kosong dan node setelah temp juga tidak kosong while akan dijalankan
			if (temp.getNext().getData().getJudulLagu().equalsIgnoreCase(judulLagu)) { //jika data nama penyanyi pada node stlh temp == judulLagu
				Node hapus = temp.getNext(); // Node yang akan dihapus
				temp.setNext(hapus.getNext()); // Menghubungkan node sebelumnya ke node setelah yang dihapus
				// Jika node berikutnya bukan null, update prev pointer-nya
				if (hapus.getNext() != null) { //jika node stlh hapus tidak kosong
					hapus.getNext().setPrev(temp); //maka node setelah hapus references nya akan disetting ke temp(node sebelum hapus)
				}
				hapus = null; // Menghapus referensi node
				return; // Node berhasil dihapus, keluar dari method
			}
			temp = temp.getNext(); //jika conditions if diatas tidak dijalankan maka temp akan dimajukan satu dengan mengisi temp dengan temp.getNext();
		}
		// Jika data tidak ditemukan setelah loop
		System.out.println("Node yang ingin dihapus dengan nama '" + judulLagu + "' tidak ditemukan");
	}	
		
	public void deleteTail() { //hapus tail, jika tailnya kosong nanti ke cetak "data kososng"- vara
		if (tail == null) {
			System.out.println("data kosong");
		}
		else {
			Node hapus = tail; //tail dimasukin ke hapus dulu (tail jd hapus), tailnya udh pindah ke data sblm tail(krn di get prev), sambungan antara data sblm tail(hapus) dgn  di putus, krn tail yg sblmnya dah masuk di hapus(tail jd hapus), lalu hapus kita jdiin null biar ilang
			tail = tail.getPrev(); 
			tail.setNext(null); 
			hapus = null; 
		}
	}

	    //edit
		public void editJudulLagu(String penyanyiLagu, String judulBaru) { //harus bikin method baru buat edit judul lagunya,methodnya untuk edit judul lagu ini berdasarkan nama penyanyi
			Node temp = head; // ini memulai pencarian judul lagu yang mau di ubah,carinya di mulai dari head
			//variabel yang nandain nanti ketemu apa engga penyanyi nya
			int found = 0; // 0 itu belum ketemu,kalau 1 udh ketemu
		
			// Loop mencari node yang sesuai dengan nama penyanyi
			while (temp != null) { //bakal jalan terus kalau masih ada node yang harus di cek
				//mengecek jika nama penyanyi pada node yang saat ini cocok apa engga sama parameter "penyanyiLagu"
				if (temp.getData().getPenyanyiLagu().equals(penyanyiLagu)) {
					// kalo dah ketemu penyanyinya nanti judulnya di ubah jadi "judulBaru"
					temp.getData().setJudulLagu(judulBaru);
					found ++; // nandain kalo penyanyinya dah ketemu
					break; //Loop nya berhenti/keluar dari loop karena penyanyinya sudah ketemu
				}
				//pindah ke node berikutnya di playlist
				temp = temp.getNext();
			}
		
			// ini kalo g ketemu nanti di kasi keterangan
			if (found==0) {
				//ini keterangan yang bakal muncul kalau penyanyinya yg di cari itu ga ketemu
				System.out.println("Lagu dari penyanyi " + penyanyiLagu + " tidak ditemukan.");
			}
		}
	/*
	* method's function = untuk menyatukan playlist dengan nama l2 pada bagian akhir playlist sekarang ini
	• [ Created date: 18 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Njo, Darren Gavriel Vankalino Santoso ) ]

	 */
	public void merge_back(Playlist l2) { //parameter l2 merupakan playlist yang ingin kita merge ke bagian akhir playlist sekarang ini
		if(this.head == null || l2.head == null) { //Mengecek apakah playlist sekarang ini atau playlist l2 kosong.
			return;// kembali langsung dan metode tidak berjalan
		}
		else {
			//menghubungkan bagian akhir dari playlist ini menuju ke bagian awal/head playlist l2
			this.tail.setNext(l2.head);
			l2.head.setPrev(this.tail);
			//mengubah tail playlist ini menjadi bagian akhir/tail playlist l2
			this.tail = l2.tail;
			//mengubah bagian awal/head dari playlist l2, menjadi playlist sekarang ini 
			l2.head = this.head;
		}
	}
	/*
	* method's function = untuk menyatukan playlist dengan nama l2 pada bagian awal/head playlist sekarang ini
	• [ Created date: 19 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Njo, Darren Gavriel Vankalino Santoso ) ]

	 */
	public void merge_front(Playlist l2) { //parameter l2 merupakan playlist yang ingin kita merge ke bagian awal/head playlist sekarang ini
		if (this.head == null || l2.head == null) {// mengecek apakah salah satu atau keduanya ada yang kosong
			return;// kembali langsung, dan metode tidak berjalan
		}
		else {
			//menghubungkan bagian awal/head dari playlist sekarang ini dengan bagian akhir/tail dari playlist l2
			l2.tail.setNext(this.head);
			this.head.setPrev(l2.tail);
			//mengubah bagian awal/head playlist sekarang ini menjadi bagian awal/head dari playlist l2 
			this.head = l2.head;
			//menjadikan bagian akhir/tail dari playlist l2 menjadi bagian akhir dari playlist sekarang ini, karena saya membuat playlist l2 juga memiliki hasil yang sama dengan playlist sekarang ini
			l2.tail = this.tail;
		}
	}
	/*
	* method's function = untuk menyatukan playlist dengan nama l2 pada bagian engah playlist sekarang ini
	• [ Created date: 19 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Njo, Darren Gavriel Vankalino Santoso ) ]
	* parameter l2 merupakan playlist yang akan kita merge dengan playlist sekarang ini, parameter setelah bertipe String yang akan kita patokan dimana akan kita selipkan playlis l2
	 */
	public void merge_middle(Playlist l2, String setelah) { 
			if (this.head == null || l2.head == null) {//mengecek apakah salah satu atau keduanya playlist kosong
				return;//langsung keluar, dan metode tidak berjalan
			}
			else {
				if(tail.getData().getJudulLagu().equals(setelah)) {//mengecek apakah bagian akhir/tail dari playlist sekarang ini itu cocok dengan parameter setelah 
					merge_back(l2);//dikirim ke method merge_back, dan di merge pada ke bagian belakang
				}
				else {
					//mencari judul yang sesuai dengan parameter setelah
					Node temp = head;
					while(temp != null) {
						if(temp.getData().getJudulLagu().equals(setelah)) {
							break;//lagu ketemu dan keluar dari while loop
						}
						temp = temp.getNext();
					}
					//jika ada judul yang sesuai maka kita merge kedua playlist tersebut 
					if(temp != null) {						
						//menyambungkan bagian akhir/tail dengan lagu setelah, lagu yang ditemukan
						temp.getNext().setPrev(l2.tail);
						l2.tail.setNext(temp.getNext());
						//menyambungkan bagian awal/head playlist l2 menuju lagu yang diinginkan
						temp.setNext(l2.head);
						l2.head.setPrev(temp);
						//mengubah bagian awal/head dan bagian akhir/tail dari playlist l2 dengan head dan tail playlist sekarang ini
						l2.head = this.head;
						l2.tail = this.tail;
					}
					else {// jika tidak ada judul yang sesuai maka akan diarahkan ke metode merge_back()
						System.out.println(setelah + " lagu tersebut tidak ada, akan ditambahkan pada bagian akhir playlist" );
						merge_back(l2);
					}
				}
			}
	}
	/*
	* method's function = untuk menghitung berapa jumlah lagu yang terdapat pada suatu playlist
	• [ Created date: 18 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Jordan Theovandy ) ]

	 */
	public int hitung() {
		int jumlah = 0; // inisialisasi variabel tipe integer untuk menyimpan jumlah lagu
		Node temp = head;
		// looping yang terus menerus sampai akhir dari playlist , untuk menghitung jumlah lagu
		while(temp != null) {
			jumlah++;
			temp = temp.getNext();
		}
		return jumlah;
	}
	/*
	* method's function = untuk memulai memutar lagu dari paling awal/head
	• [ Created date: 19 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Njo, Darren Gavriel Vankalino Santoso ) ]

	 */
	public void playAtFront() {
		if(hitung() == 0) { // mengecek apakah playlist kosong
			System.out.println("Playlist kosong");
		}
		else{
			posisi = head; // jika tidak kosong maka posisi dijadikan menjadi posisi head
			playlagu();
		}
	}
	/*
	* method's function = untuk memulai memutar lagu dari paling akhir/tail
	• [ Created date: 19 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Njo, Darren Gavriel Vankalino Santoso ) ]

	 */
	public void playAtLast() { 
		if(hitung() == 0) {// mengecek apakah playlist kosong
			System.out.println("Playlist kosong");
		}
		else{
			posisi = tail; //jika tidak kosong maka posisi dijadikan menjadi posisi tail
			playlagu();
		}
	}
	/*
	* method's function = untuk memainkan lagu berikutnya pada playlist
	• [ Created date: 19 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Njo, Darren Gavriel Vankalino Santoso ) ]

	 */
	public void play_next() {
		if (posisi == null) { //Mengecek apakah sudah memulai memainkan musik atau belum
			playAtFront(); //jika belum maka memulai memutar lagu dari paling awal/head
		}
		else {
			if (posisi.getNext() != null) {//jika sudah memulai maka mengecek apakah berikutnya masih terdapat lagu
				posisi = posisi.getNext();
				playlagu();
			}
			else { //jika tidak ada lagu berikutnya maka akan masuk kedalam sini
				System.out.println("Lagu sudah habis");
			}
		}
	}
	/*
	* method's function = untuk memainkan lagu sebelumnya pada playlist
	• [ Created date: 19 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Njo, Darren Gavriel Vankalino Santoso ) ]

	 */
	public void play_prev() {
		if (posisi == null) { //mengecek apakah sudah memulai memainkan lagu
			playAtLast(); //jika belum maka akan memulai memainkan lagu dari posisi akhir/tail
		}
		else {
			if (posisi.getPrev() != null) { //jika sudah memulai memainkan musik, maka mengecek apakah terdapat lagu sebelum lagu yang dimulai
				posisi = posisi.getPrev();
				playlagu();
			} else {//jika tidak ada lagu sebelum lagu yang dimainkan maka akan masuk kedalam sini
				System.out.println("Lagu sudah habis");
			}
		}
	}
		
	/*
	* method's function = Untuk mencari lagu yang ada di dalam playlist dengan tipe data String (judul lagu dan penyanyi)
	• [ Created date: 17 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Darlene Angelina Christy ) ]

	 */
	public void findData(String data) {
		int find=0; //digunakan untuk mencari apakah data itu ditemukan dalam list atau tidak, membuat variable baru untuk nantinya dipanggil menggunakan if
		System.out.printf("\nMencari data: " + data + "\n");
		Node temp=head;
		while(temp!=null) {
			if(temp.getData().getJudulLagu().equals(data) || temp.getData().getPenyanyiLagu().equals(data)) { // untuk membandingkan, || artinya OR/ATAU. jika antara singer atau title ada yang sama dengan data
				temp.cetak();
				find++; //menambahkan isi variabel "find" +1 untuk memberikan indikasi jika data tersebut ada
			}
			temp=temp.getNext();
		}
		if(find==0) { // untuk mencari apakah data itu ada atau tidak, jika ada maka "find" pasti bernilai > 0
			System.out.println("-------- " + data + " tidak ditemukan");
		}
	}
	
	/*
	* method's function = Untuk mencari lagu yang ada di dalam playlist dengan tipe data int (Durasi dan Tahun Rilis Lagu)
	• [ Created date: 17 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Darlene Angelina Christy ) ]

	 */
	public void findData(int data) { // penjelasan bagian method ini sama dengan method findData(String data) , hanya saja string diubah ke int
		System.out.println("\nMencari berdasarkan tahun/durasi: " + data);
		int find=0;
		Node temp=head;
		while(temp!=null) {
			if(temp.getData().getDurasiLagu()==data || temp.getData().getTahunRilis()==data) { // disini tidak menggunakan equals() karena tipe datanya merupakan int.
				temp.cetak();
				find++;
			}
			temp=temp.getNext();
		}
		if(find==0) {
			System.out.println("-------- Durasi " + data + " tidak ditemukan");
		}
	}

	/*
	* method's function = Untuk memindahkan posisi data ke posisi yang berbeda
	• [ Created date: 18 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Darlene Angelina Christy ) ]

	 */
	public void moveData(String movedata, String dataafter) { //2 parameter, yaitu String movedata dan String dataafter. movedata adalah data yang ingin kita pindah, dataafter adalah lokasi dimana data itu akan dipindahkan setelah
		Node temp=head; 
		Node dataToMove=null; //membuat Node baru untuk menyimpan sementara 
		Node afterNode=null; // sama kayak atasnya
		int checkDataToMove=0; // untuk mengecek apakah data itu ada di dalam list atau tidak
		while(temp!=null) {
			if(temp.getData().getJudulLagu().equals(movedata)){ // jika title itu sama dengan movedata (untuk data yang mau diubah posisinya)
				System.out.print("\nData yang ingin dipindah: " + movedata);
				dataToMove=temp; //temp (posisi data yang ada di temp, itu dimasukan kedalam dataToMove 
				checkDataToMove++; //pada bagian ini, hanya untuk memastikan apakah data itu ada di dalam list atau tidak, jika ada di dalam list maka pasti akan bertambah 1 pada variabel checkDataToMove
				break; // break digunakan untuk menghentikan pengulangan dari while(), agar kode tidak berjalan terus sampai akhir ketika data yang dicari sudah ketemu
			}
			else {
				temp=temp.getNext(); //menggeser lokasi temp untuk mencari data
			}
		}
		
		int checkDataAfter=0; // sama seperti checkDataToMove, apakah DataAfter itu ada di dalam list atau tidak
		temp=head; // mendeklarasikan temp baru agar isi temp ter-reset kembali ke head awal
		while(temp!=null) {
			if(temp.getData().getJudulLagu().equals(dataafter)) {// jika title adalah dataafter(lokasi dimana movedata akan diletakkan setelah dataafter)
				System.out.print("\nLetak Data Pindah Setelah: " + dataafter);
				afterNode=temp; //temp dari posisi title == dataafter akan dimasukkan ke dalam afterNode
				checkDataAfter++;
				break; // menghentikan pengulangan
			}
			else {
				temp=temp.getNext(); //menggeser lokasi temp
			}
		}
		
		if(checkDataToMove==0 && checkDataAfter==0) { // jika kedua data tidak ada (artinya kedua variabel itu valuenya 0, maka akan muncul tulisan kedua data tidak ditemukan
			System.out.println("\nKedua Judul Lagu: " + movedata + " & " + dataafter + " tidak ditemukan");
			return; // return ini digunakan untuk menghentikan kode apapun yang ada di bawah bagian if, jadi jika memang tidak ada data maka akan langsung berhenti semuanya(untuk menghindari error)
		}
		else if(checkDataToMove==0) { // jika data yang ingin dipindah tidak ada alias value 0 
			System.out.println("\nJudul Lagu "+ movedata + " untuk dipindah tidak ditemukan");
			return; // menghentikan proses di dalam method ini, agar tidak ada error
		}
		else if(checkDataAfter==0) { //jika yang tidak ada adalah letak data yang mau dipindah
			System.out.println("\nTempat pindah Judul Lagu setelah: " + dataafter + " tidak ditemukan");
			return; // menghentikan proses di dalam method ini, agar tidak ada error
		}
		
		if(dataToMove.getPrev()!=null) {//dataToMove adalah data yang mau kita pindah, mengecek apakah sebelum dataToMove ada isinya atau tidak
			dataToMove.getPrev().setNext(dataToMove.getNext()); // kalau tidak ada, maka dataToMove sebelumnya di set selanjutnya ke lanjutan dataToMove
		}
		else {
			head=dataToMove.getNext(); // jika tidak ada data sebelum dataToMove, maka head akan diperbarui menjadi data setelah dataToMove karena kita akan memindahkan dataToMove
		}
		
		if(dataToMove.getNext()!=null) {//sama seperti if(dataToMove.getPrev) , jika getNext nya tidak sama dengan null maka kita harus menghubungkan getnext ke getprev dari dataToMove
			dataToMove.getNext().setPrev(dataToMove.getPrev());
		}
		else {
			tail=dataToMove.getPrev(); // jika getNext nya adalah null, maka tail diubah menjadi getPrev dari dataToMove
		}
		
		dataToMove.setNext(afterNode.getNext());// mengeset data setelah dataToMove menjadi data setelah afterNode 
		dataToMove.setPrev(afterNode); // kemudian, data sebelum dataToMove di set ke afterNode
		afterNode.setNext(dataToMove); // setNext dari afterNode harus di set ke dataToMove 
		
		if(dataToMove.getNext()!=null) { // mengecek apakah getNext dari afterNode null atau tidak
			dataToMove.getNext().setPrev(dataToMove); //jika tidak null, maka kita setPrev dari getNext afterNode ini menjadi dataToMove
		}
		else {
			tail=dataToMove;//jika getNext afterNode itu null, berarti tail akan diubah menjadi dataToMove, alias dataToMove akan menjadi tail baru
		}
	}
	
	/*
	* method's function = untuk menampilkan lagu yang sedang diputar
	• [ Created date: 19 Oktober 2024]
	• [ Modified date : 20 Oktober 2024(by : Njo, Darren Gavriel Vankalino Santoso ) ]

	 */
	private void playlagu() { 
		System.out.println("Now Playing "+ posisi.getData().getJudulLagu()+ " by "+posisi.getData().getPenyanyiLagu());
	}
	public void cetaklist(){ // cetak dari head (vara)
	        Node temp = head; //tempny di mulai dr head
	        System.out.println("HEADNYA:"); 
	        head.cetak();
	        System.out.println("TAILNYA:"); 
	        tail.cetak(); 
	        System.out.println("\n");
	        while(temp != null){  //kalau node tempnya ga kosong, bakal cetak temp yg dr head, temp nya bakal berubah jd node yg setelah temp atau temp selanjutnya 
	            temp.cetak(); 
	            temp = temp.getNext(); 
		}
	}
	public void cetaklist_akhir(){ // Cetak dari tail, kalau node tempnya ga kosong, bakal cetak temp yg dr tail, temp nya bakal berubah jd temp yg sblm temp yg skrg (vara)
	        Node temp = tail;
	        System.out.println("HEADNYA:"); 
	        head.cetak(); 
	        System.out.println("TAILNYA:"); 
	        tail.cetak(); 
	        while(temp != null){ 
	            temp.cetak(); 
	            temp = temp.getPrev(); 
	        }
	}
}
