import 'dart:collection';
import 'dart:math';

import 'euler_solution.dart';

main(List<String> args) {
  EulerSolution.execute(new Problem029());
}

class Problem029 extends EulerSolution {
  @override
  int run() {
    var terms = new HashSet<int>();

    for (var a = 2; a <= 100; a++) {
      for (var b = 2; b <= 100; b++) {
        int big = pow(a, b);
        terms.add(big);
      }
    }

    return terms.length;
  }
}