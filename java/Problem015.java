public class Problem015 {
    private static final int size = 21;

    public static void main(String[] args) {
        long paths = countPaths(0, 0, new long[size][size]);
        System.out.printf("paths: %d\n", paths);
    }

    private static long countPaths(int i, int j, long[][] counts) {
        if (i >= size || j >= size) {
            return 0;
        }

        if (i == size - 1 && j == size - 1) {
            return 1;
        }

        // matrix itself or the matrix transpose, both are equivalent
        if (counts[i][j] > 0) {
            return counts[i][j];
        }
        else if (counts[j][i] > 0) {
            return counts[j][i];
        }

        long sum = countPaths(i + 1, j, counts) + countPaths(i, j + 1, counts);

        counts[i][j] = sum;

        return sum;
    }
}
