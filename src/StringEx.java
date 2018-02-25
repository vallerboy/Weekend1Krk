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

        String hello = "Witaj, " + " swiecie " + ", co tam u " + " Ciebie?";
        String hello1 = new StringBuilder().append("Witaj, ").append(" swiecie ").append(", co tam u ").append(" Ciebie?").toString();



        long startTime1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append("Linia: ").append(i);
        }
        long stopTime1 = System.currentTimeMillis();


        System.out.println("Sposob ze StringiemBuilderem: " + (stopTime1 - startTime1));


        long startTime = System.currentTimeMillis();
        String bookText = "";
        for (int i = 0; i < 100000; i++) {
            bookText +=  "Linia: " + i;
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Sposob ze Stringiem: " + (stopTime - startTime));
    }
}
