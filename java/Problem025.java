import java.math.BigInteger;

public class Problem025 implements EulerProblem {
    public static void main(String[] args) {
        EulerProblem.execute(new Problem025());
    }

    @Override
    public long run() {
        BigInteger fibb1 = BigInteger.ONE;
        BigInteger fibb2 = BigInteger.ONE;

        int i = 3;
        while (true) {
            BigInteger next = fibb1.add(fibb2);
            fibb1 = fibb2;
            fibb2 = next;

            if (next.toString().length() >= 1000) {
                return i;
            }

            i++;
        }
    }
}
