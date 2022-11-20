/**
    Fibonacci sequence is a sequence of numbers where each number is the sum of the two preceding numbers starting from 0 and 1.
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, ...
    1  2  3  4  5  6  7   8   9  10  11  12   13   14   15   16   17    18    19    20    21    22     23     24     25      26      27
 */
import java.math.BigInteger

/**
    This recursive function returns the Nth number in the Fibonacci sequence.
    @param: n - The index of the number in the Fibonacci sequence.
    @return: The Nth number in the Fibonacci sequence.
 */
object Fibonacci {
    suspend fun take(n: Int): BigInteger {
        if (n == 0) return 0.toBigInteger()
        if (n == 1) return 1.toBigInteger()
        return take(n - 1) + take(n - 2)
    }
}
