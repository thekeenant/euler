import java.util.HashSet;
import java.util.Set;

public class Problem029 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem029());
    }

    @Override
    public long run() {
        Set<Double> terms = new HashSet<>();
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                terms.add(Math.pow(a, b));
            }
        }
        return terms.size();
    }
}
