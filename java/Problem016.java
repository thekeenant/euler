import java.math.BigInteger;

public class Problem016 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem016());
    }

    @Override
    public long run() {
        // 2^1000, each character mapped to integer value, and summed up.
        return BigInteger.valueOf(2).pow(1000).toString().chars().mapToLong(Character::getNumericValue).sum();
    }
}
