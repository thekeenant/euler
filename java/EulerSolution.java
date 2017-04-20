import java.util.concurrent.TimeUnit;

public interface EulerSolution {
    static void execute(EulerSolution solution) {
        long startTime = System.nanoTime();
        long result = solution.run();
        long endTime = System.nanoTime();

        long duration = TimeUnit.MILLISECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS);
        System.out.printf("Result: %d\n", result);
        System.out.printf("Time: %dms\n", duration);
    }

    long run();
}
