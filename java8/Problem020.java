import java.math.BigInteger;

public class Problem020 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem020());
    }

    @Override
    public long run() {
        BigInteger big = BigInteger.valueOf(1);
        for (int i = 2; i <= 100; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        return big.toString().chars().mapToLong(Character::getNumericValue).sum();
    }
}
