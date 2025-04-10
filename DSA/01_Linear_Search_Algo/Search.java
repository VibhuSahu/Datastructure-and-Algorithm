public class Search {

    public static int LinearSearch(int[] arr, int target) {
        /**
         * Linear Search in entire array.
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         * 
         * @param arr Array of integers
         * @param target Target element to search
         * @return Index of target element or -1 if not found
         */
        int index = 0;
        for (int element : arr) {
            if (target == element) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static int LinearSearchInRange(int[] arr, int target, int start, int end) {
        /**
         * Linear Search in a specific range of array.
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         * 
         * @param arr Array of integers
         * @param target Target element to search
         * @param start Starting index (inclusive)
         * @param end Ending index (exclusive)
         * @return Index of target element or -1 if not found
         */
        for (int i = start; i < end; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int LinearSearchMax(int[] arr) {
        /**
         * Find the maximum element in array.
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         * 
         * @param arr Array of integers
         * @return Maximum element
         */
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (max < ele) {
                max = ele;
            }
        }
        return max;
    }

    public static int LinearSearchMin(int[] arr) {
        /**
         * Find the minimum element in array.
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         * 
         * @param arr Array of integers
         * @return Minimum element
         */
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            if (min > ele) {
                min = ele;
            }
        }
        return min;
    }


    public static int LinearSearchOdd(int[] arr) {
        /**
         * Count number of odd elements in array.
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         * 
         * @param arr Array of integers
         * @return Count of odd numbers
         */
        int count = 0;
        for (int ele : arr) {
            if (ele % 2 != 0) {
                count++;
            }
        }
        return count;
    }


    public static int LinearSearchEven(int[] arr) {
        /**
         * Count number of even elements in array.
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         * 
         * @param arr Array of integers
         * @return Count of even numbers
         */
        int count = 0;
        for (int ele : arr) {
            if (ele % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    public static int LinearSearchLength(int[] arr) {
        /**
         * Count number of elements in the array (Length).
         * Time Complexity: O(1)
         * Space Complexity: O(1)
         * 
         * @param arr Array of integers
         * @return Length of array
         */
        int count = 0;

        for (int elem: arr) {
            count++;
        }

        return count;
    }

    public static int LinearSearchLogLength(int[] arr) {
        /**
         * Return number of digits in the number of elements (log base 10 of length).
         * Time Complexity: O(1)
         * Space Complexity: O(1)
         * 
         * @param arr Array of integers
         * @return Number of digits in the length of array
         */
        int length = arr.length;
        if (length == 0) return 0;
        return (int) Math.log10(length) + 1;
    }
}
