import 'euler_solution.dart';

main(List<String> args) {
  EulerSolution.execute(new Problem001());
}

class Problem001 extends EulerSolution {
  @override
  int run() {
    // a list from [1,1000)
    var list = new List<int>.generate(999, (i) => i + 1);

    // filter the list for nums divisible by 3 or 5
    // then add them all together
    return
      new List<int>.generate(999, (i) => i + 1)
        .where((i) => i % 3 == 0 || i % 5 == 0)
        .fold(0, (a, b) => a + b);
  }
}