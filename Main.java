import java.util.Arrays;

public class Main {
    /*
     * @function name: Selection Sort Algorithm
     */

    public static void selectionSort(int[] arr) {
        int max;
        for (int i = arr.length - 1; i > 0; i--) {
            max = maxnum(arr, 0, i+1);
            swap(arr, max, i);
            
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int maxnum(int[] arr, int first, int second) {
        int max = first;
        for (int i = first; i < second; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] list = {-7,1,-8, 12, 32, 5, 16};

        selectionSort(list);

        System.out.println("The array - " + Arrays.toString(list)); 
    }   
}

/*
Output : The array - [-8, -7, 1, 5, 12, 16, 32]
 */