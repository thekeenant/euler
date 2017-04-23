import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem002 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem002());
    }

    @Override
    public long run() {
        // takeWhile(...) was included in Java 9 SDK, not Java 8 for some reason.

        // ~20ms
        return fastFibs().takeWhile(i -> i < 4_000_000).filter(i -> i % 2 == 0).sum();

        // ~80ms
        // return fibs().takeWhile(i -> i < 4_000_000).filter(i -> i % 2 == 0).sum();
    }

    private IntStream fastFibs() {
        return Stream.generate(new Supplier<Integer>() {
            private int n1 = 0;
            private int n2 = 1;

            @Override
            public Integer get() {
                int result = n1 + n2;
                n1 = n2;
                n2 = result;
                return result;
            }
        }).mapToInt(Integer::intValue);
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
