import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean succes = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                succes = (answer == number);
                if (answer > number) {
                    System.out.println("Jawaban lebih dari angka komputer");
                } else {
                    System.out.println("Jawaban kurang dari angka komputer");
                }
                break;
            } while (!succes);
            System.out.print("Apakah anda ingin mengulang permainan (Y/T) : ");
            menu = input.next().charAt(0);
            input.nextLine();
        } while (menu == 'y' || menu == 'Y');
    }
}
