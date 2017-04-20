module EulerSolution
  def run
    raise 'Not implemented'
  end
end

def execute(problem)
  start_time = Time.now
  result = problem.run
  end_time = Time.now

  puts "Result: #{result}"
  puts "Time: #{(end_time - start_time) * 1000}ms"
end