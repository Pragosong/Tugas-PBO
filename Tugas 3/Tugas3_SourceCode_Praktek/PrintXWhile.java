/*NIM            : 13020220130
Nama             : Eka Herlambang Budiansyah
Hari/Tanggal     : Rabu 13/03/2024
Waktu Pengerjaan : 11:00*/


import java.util.Scanner;

public class PrintXWhile {
   
    public static void main(String[] args) {
   
 
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);

        Sum = 0;
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();
        while (x != 999) {
            Sum = Sum + x; 
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
            x = masukan.nextInt();
        }
        System.out.println("Hasil penjumlahan = " + Sum);
    }
}