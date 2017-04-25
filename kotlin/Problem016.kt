import java.math.BigInteger
import java.util.stream.IntStream

fun main(args: Array<String>) {
    EulerSolution.execute(Problem016())
}

// cool class extension
fun Number.digits() : IntStream {
    return this.toString().chars().map(Character::getNumericValue)
}

class Problem016 : EulerSolution {
    override fun run() : Long {
        return BigInteger.valueOf(2).pow(1000).digits().sum().toLong()
    }
}
