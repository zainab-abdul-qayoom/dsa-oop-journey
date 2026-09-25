package phase1;

/*
 * PHASE 1: FIBONACCI
 *
 * Comparing:
 *
 * 1. Iterative Fibonacci
 * 2. Recursive Fibonacci
 */

public class Fibonacci {


    // =========================================================
    // 1. ITERATIVE FIBONACCI
    // =========================================================

    static int fibonacciIterative(int n) {

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {

            int temp = a + b;

            a = b;
            b = temp;
        }

        return a;
    }

    /*
     * TIME COMPLEXITY: O(n)
     *
     * Why?
     *
     * There is one loop.
     *
     * The loop runs n times.
     *
     * Therefore:
     *
     *     Time = O(n)
     *
     *
     * SPACE COMPLEXITY: O(1)
     *
     * Why?
     *
     * We only use:
     *
     *     a
     *     b
     *     temp
     *     i
     *
     * The number of variables stays constant even when
     * n becomes very large.
     *
     * Therefore:
     *
     *     Space = O(1)
     */


    // =========================================================
    // 2. RECURSIVE FIBONACCI
    // =========================================================

    static int fibonacciRecursive(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1)
                + fibonacciRecursive(n - 2);
    }

    /*
     * TIME COMPLEXITY: O(2^n)
     *
     * Why?
     *
     * For every value greater than 1, the function makes
     * TWO recursive calls:
     *
     *     fibonacci(n - 1)
     *     fibonacci(n - 2)
     *
     * This creates a branching recursion tree.
     *
     * Example:
     *
     *                 fib(n)
     *                /      \
     *           fib(n-1)   fib(n-2)
     *            /   \       /   \
     *          ...   ...   ...   ...
     *
     * The number of calls grows exponentially.
     *
     * Therefore, for this basic recursive implementation:
     *
     *     Time = O(2^n)
     *
     *
     * SPACE COMPLEXITY: O(n)
     *
     * Why?
     *
     * The recursion does not create all calls at the same
     * time.
     *
     * The deepest chain can reach approximately n calls.
     *
     * These calls remain on the call stack until they return.
     *
     * Therefore:
     *
     *     Space = O(n)
     */


    // =========================================================
    // COMPARISON
    // =========================================================

    /*
     *
     *                 TIME        SPACE
     *
     * Iterative      O(n)         O(1)
     *
     * Recursive      O(2^n)       O(n)
     *
     *
     * INTERVIEW LESSON:
     *
     * Both solutions produce the Fibonacci number correctly,
     * but the iterative solution is much more efficient.
     *
     * The recursive solution repeatedly calculates the same
     * Fibonacci values.
     */
}
