require './euler_solution.rb'

class Problem002
  include EulerSolution

  def run
    # ~0ms
    fast_fibs.take_while {|i| i < 4_000_000}.select {|i| i % 2 == 0}.sum

    # ~1500ms
    # fibs.take_while {|i| i < 4_000_000}.select {|i| i % 2 == 0}.sum
  end

  def fast_fibs
    Enumerator.new do |y|
      n1 = 0
      n2 = 1

      loop do
        y << n1
        n1, n2 = n2, n1 + n2
      end
    end
  end

  def fibs
    1.step(by: 1).lazy.map{|i| fib(i)}
  end

  def fib(n)
    return n if n == 0 || n == 1
    fib(n - 1) + fib(n - 2)
  end
end

execute(Problem002.new)
