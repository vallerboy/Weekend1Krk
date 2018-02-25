public class Loops {
    public static void main(String[] args) {

        START:
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < 10; i1++) {
                if(i == 2){
                    continue START;
                }
                System.out.println("X: " + i + " Y: " + i1);
            }
        }



//        for (int i = 0; i < 10; i++) {
//            if(i == 2){
//                break;
//            }
//            System.out.println("Hejo!");
//        }


        // ==
//        int x = 0;
//        while (x < 10){
//            System.out.println("Hejo");
//            x++;
//        }
//
//        do{
//            System.out.println("Heo!");
//        }while (x < 10);
    }
}
