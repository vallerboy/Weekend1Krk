import java.util.*;

public class Task7Loops {
    public static void main(String[] args) {
             Random random = new Random();
        int[] arrayOfInt = new int[6];

        boolean ended = false;

        while (!ended){
                int randomInt = random.nextInt(50 - 1) + 1;

                boolean hasNumber = false;
                int counterOfZero = 0;
            for (int i = 0; i < arrayOfInt.length; i++) {
                if(arrayOfInt[i] == randomInt){
                    hasNumber = true;
                }
            }

            if(hasNumber){
                continue;
            }
            boolean added = false;
            for (int i = 0; i < arrayOfInt.length; i++) {
                if(arrayOfInt[i] != 0){
                    counterOfZero++;
                }else{
                    if(!added){
                        System.out.println(randomInt);
                        arrayOfInt[i] = randomInt;
                        added = true;
                    }
                }
            }

            if(counterOfZero >= 6){
                ended = true;
            }
        }


//        Set<Integer> set  = new HashSet<>();
//        while (set.size() < 6){
//            set.add(random.nextInt(8 - 1) + 1);
//        }
//
//        set.forEach(System.out::println);
    }
}
