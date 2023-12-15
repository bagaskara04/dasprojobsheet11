import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai bintang : ");
        int bintang = input.nextInt();

        for (int i = bintang; i >= 1; i--) {
            for (int j = i; j <= i; j++) {
                System.out.print("");
                for (int j2 = i; j2 <= i; j2++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
