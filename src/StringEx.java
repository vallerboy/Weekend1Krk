import java.util.Locale;

public class StringEx {
    public static void main(String[] args) {
        int age = 5;
        int age1 = 5;

        String cos = "Cos";
        String cos1 = new String("Cos");

        Integer integer = new Integer(5);
        Integer integer1 = new Integer(5);


        if(cos.equals(cos1)){
            System.out.println("Rowne");
        }else{
            System.out.println("Rozne");
        }

        String text = "Ala";
        text = text.concat(" ma kota!");


        String cosiek = null;
        String cosiek1 = "";
        String cosiek2 = " asdsadsadsadad";

        cosiek.isEmpty();


        System.out.println(text);
    }
}
