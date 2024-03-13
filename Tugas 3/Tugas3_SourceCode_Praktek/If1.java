/*NIM            : 13020220130
Nama             : Eka Herlambang Budiansyah
Hari/Tanggal     : Rabu 13/03/2024
Waktu Pengerjaan : 11:00*/


import java.util.Scanner;
public class If1 {
 
    public static void main(String[] args) {
      
        Scanner masukan = new Scanner(System.in);
        int a;
        
        System.out.print("Contoh IF satu kasus \n");
        System.out.print("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a >= 0)
            System.out.print("\nNilai a positif " + a);
    }
}