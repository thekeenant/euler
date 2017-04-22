import java.util.concurrent.TimeUnit

interface EulerSolution {
    companion object {
        fun execute(soln : EulerSolution) {
            val start = System.nanoTime()
            val result = soln.run()
            var end = System.nanoTime()

            println("Result: $result")
            println("Result: ${TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS)}ms")
        }
    }

    fun run() : Long
}