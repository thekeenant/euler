import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem035 implements EulerProblem {
    public static void main(String[] args) {
        EulerProblem.execute(new Problem035());
    }

    @Override
    public long run() {
        int max = 1_000_000;

        // list of primes (index 0 = 1, 1 = 2, 2 = 3)
        // true means the index + 1 is prime
        List<Boolean> primes = IntStream.range(1, max + 1).mapToObj((i) -> true).collect(Collectors.toList());
        primes.set(0, false);

        for (int i = 2; i <= max / 2; i++) {
            for (int j = i * 2; j <= max; j += i) {
                primes.set(j - 1, false);
            }
        }

        int count = 0;

        for (int i = 0; i < primes.size(); i++) {
            // check the number to begin with
            if (!primes.get(i)) {
                continue;
            }

            if (isCircularPrime(i + 1, primes)) {
                count++;
            }
        }

        return count;
    }

    private boolean isCircularPrime(int num, List<Boolean> primes) {
        String str = String.valueOf(num);

        for (int j = 0; j < str.length(); j++) {
            String chomp = str.substring(0, j);
            String result = str.substring(j, str.length()) + chomp;

            int resultInt = Integer.valueOf(result);
            if (!primes.get(resultInt - 1)) {
                return false;
            }
        }

        return true;
    }
}
