public class dynamic {
    public static void main(String[] args) {

        long a = 0, b = 1;

        // fib(10)
        for (int i = 2; i <= 10; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        long fib10 = b;

        // reset
        a = 0;
        b = 1;

        // fib(20)
        for (int i = 2; i <= 20; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        long fib20 = b;

        long c = fib10 + fib20;

        System.out.println("fib(10) = " + fib10);
        System.out.println("fib(20) = " + fib20);
        System.out.println("c = " + c);
    }
}