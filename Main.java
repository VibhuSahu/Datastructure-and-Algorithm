public class Main {
    public static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        } 
        return -1;
    }

    public static int SearchFloorValue(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return (end >= 0) ? arr[end] : -1;
    }

    public static int SearchCeilingValue(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return (start < arr.length) ? arr[start] : -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 21, 22, 24, 27};
        int target = 5;
        int example = 7;

        System.out.println("Search target: " + Search(arr, target));
        System.out.println("Search example: " + Search(arr, example));

        System.out.println("Floor of target: " + SearchFloorValue(arr, target));
        System.out.println("Floor of example: " + SearchFloorValue(arr, example));

        System.out.println("Ceiling of target: " + SearchCeilingValue(arr, target));
        System.out.println("Ceiling of example: " + SearchCeilingValue(arr, example));
    }
}

/*
Output :
Search target: 5
Search example: -1
Floor of target: 5
Floor of example: 5
Ceiling of target: 5
Ceiling of example: 21
*/