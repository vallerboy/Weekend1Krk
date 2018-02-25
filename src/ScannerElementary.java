import java.util.Scanner;

public class ScannerElementary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int someNumber = Integer.parseInt(scanner.nextLine()) * 10;
        System.out.println(someNumber);
    }
}
