import java.util.Scanner;

public class tugas308 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko : ");
        int jmlToko = sc.nextInt();

        do {
            if (jmlToko < 1) {
                System.out.println("Jumlah toko minimal 1.");
                System.out.print("Masukkan jumlah toko : ");
                jmlToko = sc.nextInt();
            }
        } while (jmlToko < 1);

        int barangTerByk = -1;
        int barangTerByk2 = 0;
        int totalBarang = 0;

        for (int i = 1; i <= jmlToko; i++) {
            System.out.print("Masukkan jumlah pelanggan toko " +i +" : ");
            int pelanggan = sc.nextInt();
            do {
                if (pelanggan < 0) {
                    System.out.println("Input tidak boleh negatif.");
                    System.out.print("Masukkan jumlah pelanggan toko " +i +" : ");
                    pelanggan = sc.nextInt();
                }
            } while (pelanggan < 0);
        
            int total = 0;
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("Jumlah barang yang dibeli pelanggan " +j +" : ");
                int barang = sc.nextInt();
                do {
                    if (barang < 0) {
                        System.out.println("Input tidak boleh negatif.");
                        System.out.print("Jumlah barang yang dibeli pelanggan " +j +" : ");
                        barang = sc.nextInt();
                    }
                } while (barang < 0);
                total += barang;
                totalBarang += barang;
            }
            System.out.println("=========================================");
            System.out.println("Toko " +i +" - pelanggan : " +pelanggan +", total barang : " +total);
            System.out.println("=========================================");

            int nomorToko = 1;
        
            if (total > barangTerByk) {
                barangTerByk = total;
                barangTerByk2 = nomorToko;
            }
            nomorToko++;
        }
        System.out.println("Total barang seluruh toko\t: " +totalBarang);
        System.out.println("Toko dengan barang terbanyak\t: " +barangTerByk2);
    }
}