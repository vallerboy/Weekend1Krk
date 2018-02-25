import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a = 5, b = -2, c = 6;

        if(a <= b && a <= c){
            System.out.println(a);
        }else if(b <= c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
