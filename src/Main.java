public class Main {
    public static void main(String[] args) {
        int cos9 = 12;
        cos9 = cos9 * 10;
        //==
        cos9 *= 10;

        cos9 = cos9 + 1;
        cos9 += 1;

        System.out.println(cos9--);
        System.out.println(--cos9);
    }
}
