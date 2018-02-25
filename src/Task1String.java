import java.util.Scanner;

public class Task1String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz słowo: ");
        String word = scanner.nextLine();

        System.out.println("Długosc to: " + word.length());
    }
}
