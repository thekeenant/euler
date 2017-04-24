require "./euler_solution.cr"

class Problem001
  include EulerSolution

  def run
    (1..999).select{|i| i % 3 == 0 || i % 5 == 0}.sum
  end
end

execute(Problem001.new)
