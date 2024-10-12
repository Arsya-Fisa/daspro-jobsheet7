import java.util.Scanner;
public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    double harga = 50000,jumlahtiket = 0;
    int totalHarga = 0, totalTiket = 0,  totalbayar = 0;
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


    totalHarga = (int) (jumlahtiket * harga);
    totalbayar = (int) (totalHarga-(diskon*totalHarga)) ;
    totalTiket = (int) jumlahtiket;
    System.out.println("Total penjualan tiket: " + totalTiket + " Tiket");
    System.out.println("Total harga tiket: " + totalHarga);
    System.out.println("Total harga penjualan tiket (selama 1 hari): " + totalbayar);
    
       

    } while (true);

    }
}
