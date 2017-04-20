import java.util.HashMap;
import java.util.Map;

public class Problem206 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem206());
    }

    // 1_2_3_4_5_6_7_8_9_0
    private final static Map<Integer, Integer> format = new HashMap<Integer, Integer>() {{
        put(0, 1);
        put(2, 2);
        put(4, 3);
        put(6, 4);
        put(8, 5);
        put(10, 6);
        put(12, 7);
        put(14, 8);
        put(16, 9);
        put(18, 0);
    }};

    @Override
    public long run() {
        // boundaries calculated with math
        long min = 1010101010; // sqrt of 1020304050607080900
        long max = 1389026623; // sqrt of 1929394959697989990

        for (long i = min; i < max; i++) {
            long sq = i * i;

            if (matchesFormat(sq)) {
                return i;
            }
        }

        throw new RuntimeException("math broke, universe collapsed");
    }

    private boolean matchesFormat(long number) {
        String str = Long.toString(number);

        for (int n : format.keySet()) {
            int expected = format.get(n);
            int actual = Character.getNumericValue(str.charAt(n));

            if (expected != actual) {
                return false;
            }
        }

        return true;
    }
}
