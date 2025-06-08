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

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] list = {1,4,6,2,5,3};

        CycleSortAlgo(list);

        System.out.println("The array - " + Arrays.toString(list)); 
    }   
}

/*
Output : The array - [-8, -7, 1, 5, 12, 16, 32]
 */