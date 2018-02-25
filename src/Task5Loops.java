import java.util.Scanner;

public class Task5Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int someNumber = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= someNumber; i++) {
            sum += i;
        }

        System.out.println("Suma to: " + sum);
    }
}
