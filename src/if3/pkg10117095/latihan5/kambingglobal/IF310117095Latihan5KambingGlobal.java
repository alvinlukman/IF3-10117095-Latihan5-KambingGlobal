/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if3.pkg10117095.latihan5.kambingglobal;

/**
 *
 * @author 
 * NAMA         : Alvin Lukman Nulhakim
 * KELAS        : IF-3
 * NIM          : 10117095
 * Deklarasi    : Program ini berisi kombinasi atau hubungan nilai yang 
 *                tertulis sebelmnya pada public class dan bisa ditambahkan
 */
public class IF310117095Latihan5KambingGlobal {

     // Variabel jumlahKambing menjadi variabel instance
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah Kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    public void tambahKambing(){
      jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " +
                           jumlahKambing);
    }
    public static void main(String[] args) {
    IF310117095Latihan5KambingGlobal kambingSusu = new 
                    IF310117095Latihan5KambingGlobal();
       
       // Menampilkan jumlah kabing yang ada saat program pertama N berjalan
       kambingSusu.getJumlahKambing();
       
       // Menambah satu kambing
       kambingSusu.tambahKambing();
       
       // Menampilkan jumlah kambing yang ada
       kambingSusu.getJumlahKambing();
    }
    
}
