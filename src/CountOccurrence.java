import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        int count = occurrenceOfRInString(userInput);
        System.out.println(count);
    }

    private static int occurrenceOfRInString(String userInput) {
        int count = 0;
        if (userInput.endsWith("r")) {
            count = 1;
        }

        if (userInput.length() == 0) {
            return 0;
        } else {
            return count + occurrenceOfRInString(userInput.substring(0, userInput.length() - 1));
        }
    }
}
