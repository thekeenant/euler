load 'euler_problem.rb'
require 'date'

class Problem016
  include EulerProblem

  def run
    (2**1000).digits.sum
  end
end

execute(Problem016.new)