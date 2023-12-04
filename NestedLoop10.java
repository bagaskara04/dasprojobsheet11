import java.util.Scanner;

public class NestedLoop10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        double rata;

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + i) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            double total = 0;
            for (int j = 0; j < temps[i].length; j++) {
                //System.out.print(temps[i][j] + " ");
                total += temps[i][j];
            }
            rata = total / temps[0].length;
            System.out.println("Rata rata temperatur adalah "+rata);
        }

        // for (int i = 0; i < temps.length; i++) {
        // System.out.println("City : "+i);
        // for (double temp : temps[i]) {
        // System.out.print(temp + " ");
        // }
        // System.out.println();
        // }
    }
}
