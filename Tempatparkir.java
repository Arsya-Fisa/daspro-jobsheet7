import java.util.Scanner;
public class Tempatparkir {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int jenis, durasi, total = 0;
    
    do {
    System.out.println("Masukan Jenis kendaraan (1. mobil, 2. Motor, 0. Keluar)");
    jenis  = sc.nextInt();

    if (jenis == 1 || jenis == 2) {
        System.out.println("Masukan durasi: "); 
        durasi = sc.nextInt();  
    
        if (durasi > 5) {
            total += 12500;

        }else {
            if (jenis == 1) {
                total += durasi * 3000;
            }
            else if (jenis == 2) {
                total += durasi * 2000;
            }
            
        }
        
        
            }
            else if (jenis == 0) {
                System.out.println("Total harga: " + total);
           
            System.out.println("Keluar dari pembayaran");
        }
    }while (jenis != 0);
    }
}


 


