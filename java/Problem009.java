public class Problem009 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem009());
    }

    @Override
    public long run() {
        int big = 1000;

        for (int a = 1; a < big; a++) {
            for (int b = a + 1; b < big; b++) {
                // may not be a natural number
                double cReal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

                // good enough check
                if (cReal == (int) cReal) {
                    int c = (int) cReal;
                    if (a + b + cReal == 1000) {
                        return a * b * c;
                    }
                }
            }
        }

        throw new RuntimeException("doesn't happen i swear");
    }
}
