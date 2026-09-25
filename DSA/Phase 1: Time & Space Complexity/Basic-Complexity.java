package phase1;

/*
 * PHASE 1: TIME AND SPACE COMPLEXITY
 *
 * This file contains basic examples of:
 * O(1)
 * O(n)
 * O(n^2)
 * O(log n)
 * O(n log n)
 */

public class BasicComplexity {

    // ---------------------------------------------------------
    // Example 1: O(1) - Constant Time
    // ---------------------------------------------------------

    static int getFirstElement(int[] arr) {
        return arr[0];
    }

    /*
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     *
     * Why?
     * We access only one element of the array.
     * It does not matter whether the array contains:
     * 10 elements, 100 elements, or 1,000,000 elements.
     *
     * The number of operations stays approximately the same.
     *
     * Therefore:
     * Time = O(1)
     * Space = O(1)
     */


    // ---------------------------------------------------------
    // Example 2: O(n) - Linear Time
    // ---------------------------------------------------------

    static void printNumbers(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * Why?
     * The loop runs n times.
     *
     * If n = 10, it runs 10 times.
     * If n = 100, it runs 100 times.
     *
     * Therefore, the amount of work grows directly with n.
     *
     * Space is O(1) because we only use a fixed number
     * of variables. We are not creating another data
     * structure that grows with n.
     */


    // ---------------------------------------------------------
    // Example 3: O(n^2) - Quadratic Time
    // ---------------------------------------------------------

    static void printPairs(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.println(i + " " + j);
            }
        }
    }

    /*
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     *
     * Why?
     *
     * Outer loop:
     *     O(n)
     *
     * Inner loop:
     *     O(n)
     *
     * Because the inner loop runs for every iteration
     * of the outer loop:
     *
     *     O(n) × O(n)
     *     = O(n^2)
     *
     * Space is O(1) because only i and j are used.
     */


    // ---------------------------------------------------------
    // Example 4: O(log n) - Logarithmic Time
    // ---------------------------------------------------------

    static void doublingLoop(int n) {

        int i = 1;

        while (i < n) {

            System.out.println(i);

            i = i * 2;
        }
    }

    /*
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     *
     * Why?
     *
     * The value of i doubles every time:
     *
     * 1 -> 2 -> 4 -> 8 -> 16 -> 32 -> ...
     *
     * We are not increasing by 1.
     * We are repeatedly multiplying by 2.
     *
     * Therefore, the number of iterations is logarithmic.
     *
     * Time = O(log n)
     *
     * Space is O(1) because only i is used.
     */


    // ---------------------------------------------------------
    // Example 5: O(n log n)
    // ---------------------------------------------------------

    static void linearAndLogarithmic(int n) {

        for (int i = 0; i < n; i++) {

            int j = 1;

            while (j < n) {

                System.out.println(i + " " + j);

                j = j * 2;
            }
        }
    }

    /*
     * Time Complexity: O(n log n)
     * Space Complexity: O(1)
     *
     * Why?
     *
     * Outer loop:
     *     O(n)
     *
     * Inner loop:
     *     O(log n)
     *
     * They are nested, so we multiply:
     *
     *     O(n) × O(log n)
     *     = O(n log n)
     *
     * Space is O(1) because only a fixed number of
     * variables are used.
     */
}
