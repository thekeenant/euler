import java.util.ArrayList;
import java.util.List;

public class Problem010 implements EulerSolution {
    private static final long MAX_PRIME = 2_000_000;

    public static void main(String[] args) {
        EulerSolution.execute(new Problem010());
    }

    @Override
    public long run() {
        List<Integer> mults = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < MAX_PRIME - 1; i++) {
            int num = i + 1;

            nums.add(num);
            if (num > 1 && num < MAX_PRIME / 2) {
                mults.add(num);
            }
        }

        // so threaded, totally makes a difference not really
        mults.parallelStream().forEach((mult) -> {
            for (int num = mult * 2; num < MAX_PRIME; num += mult) {
                int index = num - 1;
                nums.set(index, null);
            }
        });
        nums.remove(0);

        // wow threaded so cool
        return nums.parallelStream().mapToLong((num) -> num == null ? 0 : num).sum();
    }
}
