# Example of using Coroutines in Kotlin
### Function to calculate the Fibonacci sequence

**Branches:**
 - *main* - contains the task solution
 - *base_fibonacci* - contains the recursive realisation of Fibonacci sequence without coroutines :)
---
## Task description
> 1. The number n must be entered from the keyboard. The entered characters must be checked for compliance with the condition n > 0. If the condition is not met, the program should indicate an input error and offer to enter a number until the correct value is entered.
> 2. Calculate the desired sequence member using the formula F(n) = F(n-1) + F(n-2) and loop.
> 3. The result must be displayed on the screen.
> 4. Inside the **singleton object** create a **suspended function** *take* that takes a number n and returns the result of the calculation of the Fibonacci sequence number (**BigInteger**).
> 5. Import Kotlinx.Coroutines library (*ProjectStructure -> Libraries -> + -> From Maven -> **"org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:version"***).
> 6. Run several (2 or more) coroutines in parallel and display the result of their work on the screen.
> 7. Timeout cancellation throws a TimeoutCancellationException. Handle this exception and print a message to the console about the calculation timeout.
> 8. Run another coroutine, which will be a calculation indicator and print points to the console. This coroutine should work as long as all your Fibonacci numbers are being calculated.
> #### EXTRA INFORMATION:
> The numbers in the loop are calculated quickly, therefore, in order for the cancellation by timeout to be noticeable, it is necessary to calculate numbers from the Fibonacci sequence with a fairly large ordinal number. Using loop instead of recursion and BigInteger instead of Long will get rid of data type overflow and stack overflow.
---
