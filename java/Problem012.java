public class Problem012 implements EulerProblem {
    public static void main(String[] args) {
        EulerProblem.execute(new Problem012());
    }

    @Override
    public long run() {
        long start = 1;
        long big = 1_000_000_000; // arbitrary big number

        for (long i = start; i < big; i++) {
            long triangleNum = 0;

            for (long j = 1; j <= i; j++) {
                triangleNum += j;
            }

            // fast divisor counting
            int divisors = 0;
            long limit = (long) Math.sqrt(triangleNum);
            for (long j = 1; j <= limit; j++) {
                if (triangleNum % j == 0) {
                    divisors++;
                    if (triangleNum / j != j) {
                        divisors++;
                    }
                }
            }

            if (divisors > 500) {
                return triangleNum;
            }
        }

        throw new RuntimeException("nothing found wtf");
    }
}
