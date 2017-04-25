require './euler_solution.rb'
require 'set'

class Problem029
  include EulerSolution

  def run
    terms = Set.new
    (2..100).each do |a|
      (2..100).each do |b|
        terms << a ** b
      end
    end
    terms.size
  end
end

execute(Problem029.new)
