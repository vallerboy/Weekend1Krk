import java.util.Random;
import java.util.Scanner;

public class Task6Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int winnerNumber = random.nextInt(1000);

        int typedNumber;
        do{
            System.out.print("Podaj liczbę: ");
            typedNumber = scanner.nextInt();

            if(typedNumber > winnerNumber){
                System.out.println("Celuj troche nizej");
            }else if(typedNumber < winnerNumber){
                System.out.println("Celuj troche wyzej");
            }

        }while (winnerNumber != typedNumber);
        System.out.println("GRATULACJE!!!!!!!!!!!!!!!! WYGRANA");
    }
}
