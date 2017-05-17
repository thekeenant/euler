import 'dart:async';
import 'euler_solution.dart';

main(List<String> args) {
  EulerSolution.execute(new Problem001());
}

class Problem001 extends EulerSolution {
  @override
  Future<int> run() async {
    // filter the list for nums divisible by 3 or 5
    // then add them all together
    return new List<int>.generate(999, (i) => i + 1)
        .where((i) => i % 3 == 0 || i % 5 == 0)
        .reduce((a, b) => a + b);
  }
}