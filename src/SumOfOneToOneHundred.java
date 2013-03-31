public class SumOfOneToOneHundred {
    public static void main(String[] args) {
        int total = sumOfOneTo(100);
        System.out.println(total);
    }

    private static int sumOfOneTo(int i) {
        if (i == 1) {
            return i;
        } else {
            return i + sumOfOneTo(i - 1);
        }
    }
}
