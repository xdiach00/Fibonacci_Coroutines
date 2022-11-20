fun main() {
    println("Enter a number:")
    var n = readln().toInt()
    while (1 == 1) {
        if (n >= 0) break
        else {
            println("Please enter a positive number:")
            n = readln().toInt()
        }
    }

    println(countFibonacci(n - 1))
}