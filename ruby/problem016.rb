load 'euler_solution.rb'

class Problem016
  include EulerSolution

  def run
    (2**1000).digits.sum
  end
end

execute(Problem016.new)