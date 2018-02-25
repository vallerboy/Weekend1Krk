public class Task13Elementary {
    public static void main(String[] args) {
        String palindrome = "kajak";

        boolean isPalindrome = true;
        for(int i = 0; i < palindrome.length(); i++){
            if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }


        if(isPalindrome){
            System.out.println("Jest");
        }else{
            System.out.println("Nie jest");
        }
    }
}
