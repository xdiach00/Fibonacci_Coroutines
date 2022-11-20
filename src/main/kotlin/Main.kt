import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    println("Enter a number:")
    var n = readln().toInt()
    while (1 == 1) {
        if (n >= 0) break
        else {
            println("Please enter a positive number:")
            n = readln().toInt()
        }
    }

    try {
        withTimeout(2000) {
            CoroutineScope(Dispatchers.Default).launch {
                println("The $n-th number in the Fibonacci sequence is ${Fibonacci.take(n)}")
            }
        }
    } catch (t: TimeoutCancellationException) {
        println("The $n-th number in the Fibonacci sequence is too big.")
    }

    val secondThread = CoroutineScope(Dispatchers.Default).launch {
        println("This is the second thread. The 8th fibonacci number is ${Fibonacci.take(8)}")
    }

    val thirdThread = CoroutineScope(Dispatchers.Default).launch {
        println("This is the third thread. The 9th fibonacci number is ${Fibonacci.take(9)}")
    }

    launch {
        while (secondThread.isActive || thirdThread.isActive) {
            print(".")
        }
    }
}