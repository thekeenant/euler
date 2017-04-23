import java.util.stream.IntStream;

public class Problem001 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem001());
    }

    @Override
    public long run() {
        // ~ 50 ms
        return IntStream.range(1, 1000).filter(i -> i % 3 == 0 || i % 5 == 0).sum();

        // ~0 ms
        // int result = 0;
        // for (int i = 1; i < 1000; i++) {
        //     if (i % 3 == 0 || i % 5 == 0) {
        //         result += i;
        //     }
        // }
        // return result;
    }
}
