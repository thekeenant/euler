import java.math.BigDecimal

fun main(args: Array<String>) {
    EulerSolution.execute(Problem026())
}

/**
 * Not done!
 */
class Problem026 : EulerSolution {
    override fun run() : Long {
        val one = BigDecimal.ONE.setScale(2000)

        var longest : Int

        for (d in 1..10) {
            val big = one / BigDecimal.valueOf(d.toDouble()).setScale(2000)
            val str = big.toString().substringAfter('.')

            var max = 0

            for (i in 1..5) {
                val sub = str.substring(0, i)
                println(sub + sub + sub)
                if (str.startsWith(sub + sub + sub)) {
                    println("--- YES")
                    max = i
                }
            }

            println("$d = $max")
        }

        return 0
    }
}
