package phase1;

/*
 * PHASE 1: BINARY SEARCH
 *
 * Binary Search works on a SORTED array.
 */

public class BinarySearchComplexity {

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}

/*
 * TIME COMPLEXITY: O(log n)
 *
 * Why?
 *
 * Binary Search does NOT check every element.
 *
 * After checking the middle element, approximately half
 * of the remaining search space is removed.
 *
 * Example:
 *
 *     n
 *     ↓
 *     n/2
 *     ↓
 *     n/4
 *     ↓
 *     n/8
 *     ↓
 *     ...
 *     ↓
 *     1
 *
 * Every iteration cuts the search space approximately
 * in half.
 *
 * Therefore:
 *
 *     Time = O(log n)
 *
 *
 * SPACE COMPLEXITY: O(1)
 *
 * Why?
 *
 * This is an iterative implementation.
 *
 * We only use a fixed number of variables:
 *
 *     start
 *     end
 *     mid
 *
 * We do not create another array or recursive call stack.
 *
 * Therefore:
 *
 *     Space = O(1)
 *
 *
 * IMPORTANT:
 *
 * Binary Search requires the array to be sorted.
 *
 *
 * INTERVIEW COMPARISON:
 *
 * Linear Search:
 *     Time = O(n)
 *     Space = O(1)
 *
 * Binary Search:
 *     Time = O(log n)
 *     Space = O(1)
 */
