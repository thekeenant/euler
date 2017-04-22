import 'euler_solution.dart';

main(List<String> args) {
  EulerSolution.execute(new Problem001());
}

class Problem001 extends EulerSolution {
  @override
  int run() {
    // Dynamically generate fibonacci sequence
    // it has an arbitrarily large max, we don't generate that much
    var list = new Iterable<int>.generate(1000000000, (i) => fib(i));
    return list
        .takeWhile((i) => i <= 4000000)
        .where((i) => i.isEven)
        .fold(0, (a, b) => a + b);
  }

  int fib(int n) {
    if (n == 0)
      return 0;
    else if (n == 1)
      return 1;
    else
      return fib(n - 1) + fib(n - 2);
  }
}