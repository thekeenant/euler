import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Problem017 implements EulerSolution {
    private static final Map<Integer, String> base = new HashMap<Integer, String>() {{
        put(1, "one");
        put(2, "two");
        put(3, "three");
        put(4, "four");
        put(5, "five");
        put(6, "six");
        put(7, "seven");
        put(8, "eight");
        put(9, "nine");
        put(10, "ten");
        put(11, "eleven");
        put(12, "twelve");
        put(13, "thirteen");
        put(14, "fourteen");
        put(15, "fifteen");
        put(16, "sixteen");
        put(17, "seventeen");
        put(18, "eighteen");
        put(19, "nineteen");
        put(20, "twenty");
        put(30, "thirty");
        put(40, "forty");
        put(50, "fifty");
        put(60, "sixty");
        put(70, "seventy");
        put(80, "eighty");
        put(90, "ninety");
    }};

    public static void main(String[] args) {
        EulerSolution.execute(new Problem017());
    }

    @Override
    public long run() {
        return IntStream.range(1, 1001).map(this::count).sum();
    }

    private int count(int number) {
        if (number < 20 || (number < 100 && number % 10 == 0)) {
            if (number == 0) {
                return 0;
            }
            return base.get(number).length();
        }
        else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;

            return base.get(tens * 10).length() + count(ones);
        }
        else if (number < 1000) {
            int hundreds = number / 100;
            int rest = number % 100;

            int and = count(rest);
            and = and == 0 ? 0 : and + 3;

            // "____ hundred and ____"
            // hundred = 7
            return count(hundreds) + 7 + and;
        }
        else if (number == 1000) {
            // one thousand = 11
            return 11;
        }

        throw new RuntimeException("not accepted");
    }
}
