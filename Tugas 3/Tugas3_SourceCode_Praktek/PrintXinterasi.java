/*NIM            : 13020220130
Nama             : Eka Herlambang Budiansyah
Hari/Tanggal     : Rabu 13/03/2024
Waktu Pengerjaan : 11:00*/


import java.util.Scanner;


public class PrintXinterasi {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int Sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);
    
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();
        if (x == 999) {
            System.out.print("Kasus kosong \n");
        } else { 
            Sum = x;
            for (;;) {
                System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt();
                if (x == 999)
                    break;
                else {
                    Sum = Sum + x;
                }
            }
        }
        System.out.println("Hasil penjumlahan = " + Sum);
    
    }
}