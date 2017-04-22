abstract class EulerSolution {
  static void execute(EulerSolution solution) {
    Stopwatch timer = new Stopwatch()..start();
    int result = solution.run();

    print("Result: ${result}");
    print("Time: ${timer.elapsedMilliseconds}ms");
  }

  int run();
}