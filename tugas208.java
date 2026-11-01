import java.util.Scanner;
public class tugas208 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int jumlah = 0;
        
        if (n < 3) {
            System.out.println("Nilai minimal 3.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                System.out.print("   "+i * j +"   ");
                jumlah += i*j;
            }
            System.out.println();
            }
            System.out.println("Jumlah seluruh angka : " +jumlah);
        }
    }
}