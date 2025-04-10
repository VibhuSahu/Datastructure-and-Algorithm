public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6, 8};

        // Using Search functions
        System.out.println("Index of 6: " + Search.LinearSearch(numbers, 6));
        System.out.println("Index of 9 in range (2 to 5): " + Search.LinearSearchInRange(numbers, 9, 2, 5));
        System.out.println("Maximum: " + Search.LinearSearchMax(numbers));
        System.out.println("Minimum: " + Search.LinearSearchMin(numbers));
        System.out.println("Odd count: " + Search.LinearSearchOdd(numbers));
        System.out.println("Even count: " + Search.LinearSearchEven(numbers));
        System.out.println("Array length: " + Search.LinearSearchLength(numbers));
        System.out.println("Log10 of length (digit count): " + Search.LinearSearchLogLength(numbers));
    }
}


/*
Output : 
Index of 6: 4
Index of 9 in range (2 to 5): 2
Maximum: 9
Minimum: 1
Odd count: 4
Even count: 2
Array length: 6
Log10 of length (digit count): 1
 */