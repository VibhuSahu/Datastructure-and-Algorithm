public class Main {
    public static int singleFiboNumber(int n) {
        if (n < 2) {
            return n;
        }

        return singleFiboNumber(n-1) + singleFiboNumber(n-2);
    }
    public static void main(String[] args) {
        
        System.err.println(singleFiboNumber(0));


        
    }
}
