import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Problem023 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem023());
    }

    @Override
    public long run() {
        boolean[] abundants = new boolean[28123 + 1];
        for (int i = 1; i < abundants.length; i++) {
            abundants[i] = isAbundant(i);
        }

        long result = 0;

        for (int i = 1; i <= 28123; i++) {
            if (!isSumOfAbundants(i, abundants)) {
                result += i;
            }
        }

        return result;
    }

    private boolean isSumOfAbundants(int num, boolean[] abundants) {
        for (int i = 0; i <= num; i++) {
            if (abundants[i] && abundants[num - i]) {
                return true;
            }
        }
        return false;
    }

    private boolean isAbundant(long num) {
        return fastProperDivisorsSum(num) > num;
    }

    private long properDivisorsSum(long num) {
        return LongStream.range(1, num / 2 + 1).filter(i -> num % i == 0).sum();
    }

    private long fastProperDivisorsSum(long num) {
        long limit = (long) Math.sqrt(num);
        long sum = 1;
        for(long i = 2; i <= limit; i++) {
            if (num % i == 0) {
                sum += i;
                long other = num / i;
                if (num / i != i) {
                    sum += other;
                }
            }
        }
        return sum;
    }
}
