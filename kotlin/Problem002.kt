fun main(args: Array<String>) {
    EulerSolution.execute(Problem002())
}

class Problem002 : EulerSolution {
    override fun run() : Long {
        // ~10ms
        return fastFibs().takeWhile{it < 4000000}.filter{it % 2 == 0}.sum().toLong()

        // ~80ms
        // return fibs().takeWhile{it < 4000000}.filter{it % 2 == 0}.sum().toLong()
    }

    fun fastFibs() : Sequence<Int> {
        // pairs mapped to single ints
        return generateSequence(Pair(0, 1), { Pair(it.second, it.first + it.second) }).map { it.first }
    }

    fun fibs() : Sequence<Int> {
        // sequence starting at 0, incrementing by 1, mapped to fibonacci number
        return generateSequence(0) {it + 1}.map(this::fib)
    }

    fun fib(n : Int) : Int {
        if (n == 0 || n == 1) {
            return n
        }
        return fib(n - 1) + fib(n - 2)
    }
}