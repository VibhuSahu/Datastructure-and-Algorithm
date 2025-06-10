public class Main {

    public static void loop(int num, int limit) {
        if (num >= limit) {
            return;
        } else {
            System.out.println(num);
            loop(++num, limit);
        }
    }


    public static int singleFiboNumber(int n) {
        if (n < 2) {
            return n;
        }

        return singleFiboNumber(n-1) + singleFiboNumber(n-2);
    }
    public static void main(String[] args) {
        
        loop(0, 7);
        
        System.err.println(singleFiboNumber(6));


        
    }
}