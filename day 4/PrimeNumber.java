public class PrimeNumber {

    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime Number");

            for (int i = 2; i <= num; i++) {

                boolean prime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    System.out.print(i + " ");
                }
            }

        } else {
            System.out.println(num + " is Not a Prime Number");
        }
    }
}