import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem021 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem021());
    }

    @Override
    public long run() {
        Set<Integer> result = new HashSet<>();
        for (int i = 1; i < 10_000; i++) {
            int sum = divisorSum(i);
            if (sum != i && divisorSum(sum) == i) {
                result.add(sum);
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).sum();
    }

    private int divisorSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
