require "./euler_solution.cr"

class FastFibs
  include Iterator(Int32)

  def initialize
    @x = 0
    @y = 1
  end

  def next
    curr = @x + @y
    @x = @y
    @y = curr
    curr
  end
end

class Problem002
  include EulerSolution

  def run
    # ~0ms
    fast_fibs.take_while {|i| i < 4_000_000}.select {|i| i % 2 == 0}.sum

    # ~1500ms
    # fibs.take_while {|i| i < 4_000_000}.select {|i| i % 2 == 0}.sum
  end

  def fast_fibs
    FastFibs.new
  end

  def fibs
    1.step(by: 1).map{|i| fib(i)}
  end

  def fib(n)
    return n if n == 0 || n == 1
    fib(n - 1) + fib(n - 2)
  end
end

execute(Problem002.new)
