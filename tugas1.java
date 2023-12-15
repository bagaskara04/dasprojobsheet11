import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = input.nextInt();

        // for (int i = 1; i <= N; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" ");
        // for (int k = 1; k <= i; k++) {
        // System.out.print(j);
        // }
        // }
        // System.out.println();
        // }
        for (int i = 1; i <= N; i++) {
            // Mencetak spasi
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }

    }
}
