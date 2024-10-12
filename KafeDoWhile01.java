import java.util.Scanner;

public class KafeDoWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi=0, teh=0, roti=0, totalharga=0;
        String namaPelanggan;
        int hargakopi=12000;
        int hargaTeh=7000;
        int hargaroti=20000;

        do {
           System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar): ");
           namaPelanggan = sc.nextLine();
           if (namaPelanggan.equalsIgnoreCase("batal")) {
              System.out.println("Transaksi dibatalkan");
              break;
           } 
           System.out.print("jumlah Kopi: ");
           kopi = sc.nextInt();
           System.out.print("jumlah Teh: ");
           teh = sc.nextInt();
           System.out.print("jumlah Roti: ");
           roti = sc.nextInt();

           totalharga = (kopi * hargakopi) + (teh * hargaTeh) + (roti * hargaroti);
           System.out.println("total yang harus dibayar: Rp" + totalharga);
           sc.nextLine();

        } while (true);
        System.out.println("Semua Transaksi selesai");
    }
}
