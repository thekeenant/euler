import java.math.BigInteger;

public class Problem016 {
    public static void main(String[] args) {
        // 2^1000, each character mapped to integer value, and summed up.
        System.out.println(BigInteger.valueOf(2).pow(1000).toString().chars().mapToLong(Character::getNumericValue).sum());
    }
}
