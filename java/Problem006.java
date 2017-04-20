public class Problem006 {
    public static void main(String[] args) {
        int sumSq = 0;
        int sqSum = 0;

        for (int i = 1; i <= 100; i++) {
            sumSq += Math.pow(i, 2);
            sqSum += i;
        }

        sqSum = (int) Math.pow(sqSum, 2);

        System.out.println((sqSum - sumSq));
    }
}
