import java.util.concurrent.TimeUnit;

public interface EulerProblem {
    static void execute(EulerProblem problem) {
        long startTime = System.nanoTime();
        long result = problem.run();
        long endTime = System.nanoTime();

        long duration = TimeUnit.MILLISECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS);
        System.out.printf("Result: %d\n", result);
        System.out.printf("Time: %dms\n", duration);
    }

    long run();
}
