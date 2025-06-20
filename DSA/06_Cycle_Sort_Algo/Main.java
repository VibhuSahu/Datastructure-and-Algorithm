import java.util.Arrays;

public class Main {
    /*
     * @function name: Cycle Sort Algorithm
     */
    public static void CycleSortAlgo(int[] arr) {
        int n = 0;

        while( n < arr.length) {
            int correct = arr[n] - 1;
            if (arr[correct] != arr[n]) {
                swap(arr, correct, n);
            } else {
                n++;
            }
        }

    }

    public static void CycleSortAlgowith1to0(int[] arr) {
        int n = 0;
        while ( n < arr.length ) {
            if (arr[n] != n) {
                swap(arr, arr[n], n);
            } else {
            n++;  
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] list = { 1, 4, 6, 2, 5, 3 };
        int[] ls = { 1, 4, 0, 6, 2, 5, 3 };

        CycleSortAlgo(list);
        CycleSortAlgowith1to0(ls);

        System.out.println("The array - " + Arrays.toString(list)); 
        System.out.println("The array - " + Arrays.toString(ls)); 
    }   
}

/*
Output : The array - [-8, -7, 1, 5, 12, 16, 32]
         The array - [0, 1, 2, 3, 4, 5, 6]
 */