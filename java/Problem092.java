public class Problem092 implements EulerProblem {
    public static void main(String[] args) {
        EulerProblem.execute(new Problem092());
    }

    @Override
    public long run() {
        long count = 0;

        for (long i = 1; i < 10_000_000; i++) {
            if (is89(i)) {
                count++;
            }
        }

        return count;
    }

    private boolean is89(long num) {
        while (num != 1 && num != 89) {
            long curr = num;
            num = 0;

            // get each digit in the number
            while (curr > 0) {
                long res = curr / 10;
                long digit = curr - res * 10;
                curr = res;

                // add digit^2 to the value
                num += Math.pow(digit, 2);
            }
        }
        return num == 89;
    }
}
