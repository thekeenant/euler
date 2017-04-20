public class Problem014 {
    public static void main(String[] args) {
        long max = 0;
        long num = 0;
        for (int i = 1; i <= 1_000_000; i++) {
            long count = collatz(i);
            if (count > max) {
                num = i;
                max = count;
            }
        }

        System.out.println(num);
    }

    private static long collatz(long n) {
        long count = 1;

        long curr = n;

        // they all end up at 1
        while (curr != 1) {
            curr = curr % 2 == 0 ? curr / 2 : 3 * curr + 1;
            count++;
        }

        return count;
    }
}
