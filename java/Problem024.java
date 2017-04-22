import java.math.BigInteger;
import java.util.*;

public class Problem024 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem024());
    }

    @Override
    public long run() {
        List<String> list = permute("", "0123456789");
        long[] count = list.parallelStream().mapToLong(Long::parseLong).sorted().toArray();
        return count[1_000_000 - 1];
    }

    private List<String> permute(String start, String end) {
        List<String> result = new ArrayList<>();
        if (end.length() <= 1) {
            result.add(start + end);
        }
        else {
            for (int i = 0; i < end.length(); i++) {
                String next = end.substring(0, i) + end.substring(i + 1);
                result.addAll(permute(start + end.charAt(i), next));
            }
        }
        return result;
    }
}
