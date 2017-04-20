load 'euler_solution.rb'
require 'date'

class Problem016
  include EulerSolution

  def run
    (2**1000).digits.sum
  end
end

execute(Problem016.new)