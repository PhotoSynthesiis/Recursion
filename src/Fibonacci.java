import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        int sum = fibonacci(number);

        System.out.println(sum);
    }

    private static int fibonacci(int number) {
        if (number == 1) {
            return number;
        } else {
            return number + fibonacci(number - 1);
        }
    }

}
