require './euler_solution.rb'

class Problem034
  include EulerSolution

  def run
    # rough maximum number where the condition is possible
    limit = factorial(9) * 7 - 1
    result = 0

    (10..limit).each do |i|
      fact_sum = i.digits.map{|d| factorial(d)}.sum

      if fact_sum == i
        result += i
      end
    end

    result
  end

  def factorial(x)
    return 1 if x == 0 || x == 1

    y = x
    (2..x - 1).each do |i|
      y *= i
    end

    y
  end
end

execute(Problem034.new)
