import java.util.stream.IntStream;

public class Problem002 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem002());
    }

    @Override
    public long run() {
        // note that this requires java 9
        return fibs().takeWhile(i -> i < 4_000_000).filter(i -> i % 2 == 0).sum();
    }

    private IntStream fibs() {
        return IntStream.range(1, 1_000_000).map(this::fib);
    }

    private int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
