import java.util.Arrays;

public class Main {
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] list = {3, 12, 55, -11, -3, 24, 15, 33, 36, 22};

        insertionSort(list);

        System.out.println("Array of - " + Arrays.toString(list));        
    }
}
/*
Output : Array of - [-11, -3, 3, 12, 15, 22, 24, 33, 36, 55]
 */