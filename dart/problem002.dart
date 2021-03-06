import 'dart:async';
import 'dart:math';

import 'euler_solution.dart';

main(List<String> args) {
  EulerSolution.execute(new Problem001());
}

class Problem001 extends EulerSolution {

  @override
  Future<int> run() async {
    // ~200ms
    // Dynamically generate fibonacci sequence
    // it has an arbitrarily large max, we don't generate that much
    // var list = new Iterable<int>.generate(pow(2, 20), (i) => fib(i));

    // 20ms
    var list = fibStream();

    return list
      .takeWhile((i) => i <= 4000000)
      .where((i) => i.isEven)
      .reduce((a, b) => a + b);
  }

  int fib(int n) {
    if (n == 0 || n == 1)
      return n;
    else
      return fib(n - 1) + fib(n - 2);
  }

  Stream<int> fibStream() async* {
    int a = 0;
    int b = 1;

    while (true) {
      int curr = a + b;
      a = b;
      b = curr;
      yield curr;
    }
  }
}