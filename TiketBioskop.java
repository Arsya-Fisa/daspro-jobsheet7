import java.util.Scanner;
public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int harga = 50000;
    int totalHarga = 0, totalTiket = 0, jumlahtiket, totalbayar = 0;
    double  diskon = 0;

    do{
       System.out.println("Masukan jumlah tiket (ketik '-1' untuk keluar) ");
       jumlahtiket = sc.nextInt();
    if (jumlahtiket == -1) {
        System.out.println("transaksi batal");
        break;
    }
    if (jumlahtiket < 0) {
        System.out.println("nilai tidak valid");
        continue;
    }
    if (jumlahtiket > 10) {
        diskon = 0.15;
    } else if (jumlahtiket > 4) {
        diskon = 0.10;
    }else{
        diskon = 0;
    }


    totalHarga = (jumlahtiket * harga);
    totalbayar = (int) (totalHarga-(diskon*totalHarga)) ;
    System.out.println("Total harga: " + totalHarga);
    System.out.println("Total bayar: " + totalbayar);
    
       

    } while (true);

    }
}
