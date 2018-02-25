import java.util.Scanner;

public class Task3String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj słowo: ");
        String word = scanner.nextLine();

        if(word.endsWith("M") || word.endsWith("m")){
            System.out.println("Tak konczy sie na M");
        }else{
            System.out.println("Nie nie konczy sie na M");
        }

        ///
        if(word.toLowerCase().endsWith("m")){
            System.out.println("Konczy sie na M");
        }
    }
}
