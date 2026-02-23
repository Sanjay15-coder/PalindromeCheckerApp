public class PalindromChecker {
    public static void main(String[] args){
        String input = "madam";

        boolean ispalindrome = true;

        for (int i = 0; i < input.length() / 2; i++){

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)){
                ispalindrome = false;
                break;
            }
        }

        if(ispalindrome){
            System.out.println(input + "is a Palindrome.");
        }
        else{
            System.out.println(input + "is not a Palindrome");
        }
    }
}
