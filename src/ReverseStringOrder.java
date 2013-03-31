import java.util.Scanner;

public class ReverseStringOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        System.out.println("recursion : " + reverseTheOrderOfStringUsingRecursion(userInput));
    }

    private static String reverseTheOrderOfStringUsingRecursion(String userInput) {
        String last = String.valueOf(userInput.charAt(userInput.length() - 1));
        if (userInput.length() == 1) {
            return userInput;
        } else {
            return last + reverseTheOrderOfStringUsingRecursion(userInput.substring(0, userInput.length() - 1));
        }
    }
}
