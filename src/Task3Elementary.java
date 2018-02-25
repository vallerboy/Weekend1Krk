import java.util.Scanner;

public class Task3Elementary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int seats = scanner.nextInt();

        if(rows > seats){
            System.out.println("Cos chyba nie halo");
            System.exit(0);
        }

        if(seats % rows == 0) {
            System.out.println("Mamy " + rows + " rzędów po " + (seats / rows) + " miejsc");
        }else{
            rows -= 1;
            System.out.println("Mamy " + rows + " rzędów po " + (seats / rows) + "miejsc");
            System.out.println("A ostatni to " + (seats % rows));
        }
    }
}
