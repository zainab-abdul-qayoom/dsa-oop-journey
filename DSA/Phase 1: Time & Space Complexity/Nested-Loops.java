package phase1;

/*
 * PHASE 1: NESTED LOOPS
 *
 * Problem:
 * Search for a target value in a 2D array.
 */

public class NestedLoops {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        int target = 12;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == target) {

                    System.out.println(
                            "Target is in row " + i +
                            " and in column " + j
                    );
                }
            }
        }
    }
}

/*
 * TIME COMPLEXITY: O(n^2)
 *
 * Why?
 *
 * Suppose the array has n rows and n columns.
 *
 * Outer loop:
 *     visits all n rows
 *     = O(n)
 *
 * Inner loop:
 *     visits all n columns for each row
 *     = O(n)
 *
 * Because the loops are nested:
 *
 *     O(n) × O(n)
 *     = O(n^2)
 *
 * So the algorithm may check n^2 elements.
 *
 *
 * SPACE COMPLEXITY: O(1)
 *
 * Why?
 *
 * We only use a fixed number of extra variables:
 *
 *     i
 *     j
 *     target
 *
 * We are not creating another array or data structure
 * that grows with n.
 *
 * Therefore:
 *
 *     Time  = O(n^2)
 *     Space = O(1)
 *
 *
 * INTERVIEW NOTE:
 *
 * Nested loops do NOT automatically mean O(n^2).
 *
 * Always analyze what each loop is doing.
 *
 * Example:
 *
 * n loop × log n loop
 * = O(n log n)
 */
