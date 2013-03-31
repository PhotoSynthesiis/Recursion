public class CalculateTotal {
    public static void main(String[] args) {
        int result = calculateFactorialOf(6);
        int two = calculateFactorialOf(calculateFactorialOf(3));
        System.out.println(result);
        System.out.println(two);
    }

    private static int calculateFactorialOf(int i) {
        if (i == 1) {
            return i;
        } else {
            return i * calculateFactorialOf(i - 1);
        }
    }
}
