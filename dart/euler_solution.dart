import 'dart:async';

abstract class EulerSolution {
  static void execute(EulerSolution solution) {
    Stopwatch timer = new Stopwatch()..start();
    solution.run().then((result) {
      print("Result: ${result}");
      print("Time: ${timer.elapsedMilliseconds}ms");
    });
  }

  Future<int> run();
}