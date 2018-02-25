import java.util.Scanner;

public class Task2String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj słowo: ");
        String word = scanner.nextLine();

        System.out.print("Podaj liczbe N: ");
        int number = scanner.nextInt();

        if(word.length() < number){
            System.out.println("Zla liczba");
            System.exit(0);
        }

        System.out.println(word.substring(word.length()-number));
    }
}
