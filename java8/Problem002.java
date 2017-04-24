public class Problem002 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem002());
    }

    @Override
    public long run() {
        int sum = 0;

        int a = 0;
        int b = 1;
        while (true) {
            int curr = a + b;
            a = b;
            b = curr;

            if (curr >= 4_000_000) {
                break;
            }

            if (curr % 2 == 0) {
                sum += curr;
            }
        }

        return sum;
    }
}
