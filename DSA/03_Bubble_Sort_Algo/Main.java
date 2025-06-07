import java.util.Arrays;

public class Main {
    /*
     * @function Name: Bubble Sort
     */
    static void bubbleSort(int[] arr) {

        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    swapped = true;
                }

            }
            if (!swapped) break;
        }

    }



    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {

        int[] list = {-7,1,-8, 12, 32, 5, 16};
        bubbleSort(list);

        System.out.println("The sorted arr - " + Arrays.toString(list)); 
    }
}