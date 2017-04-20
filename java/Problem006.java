public class Problem006 implements EulerProblem {
    public static void main(String[] args) {
        EulerProblem.execute(new Problem006());
    }

    @Override
    public long run() {
        int sumSq = 0;
        int sqSum = 0;

        for (int i = 1; i <= 100; i++) {
            sumSq += Math.pow(i, 2);
            sqSum += i;
        }

        sqSum = (int) Math.pow(sqSum, 2);
        return sqSum - sumSq;
    }
}
