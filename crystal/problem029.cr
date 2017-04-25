require "./euler_solution.cr"

class Problem029
  include EulerSolution

  def run
    terms = Set(Float64).new
    (2..100).each do |a|
      (2..100).each do |b|
        terms << a.to_f64 ** b.to_f64
      end
    end
    terms.size
  end
end

execute(Problem029.new)
