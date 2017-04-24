require './euler_solution.rb'
require 'date'

class Problem019
  include EulerSolution

  def run
    count = 0
    (1901..2000).each do |year|
      (1..12).each do |month|
        day = Date.new(year, month, 1).wday
        if day == 0
          count += 1
        end
      end
    end
    count
  end
end

execute(Problem019.new)
