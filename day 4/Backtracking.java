public class Backtracking {
    long modPow(long b,long e, long m) {
        long result = 1;
        b = b % m;
        while (e > 0) {
            if (e % 2 == 1) {
                result = (result * b) % m;
            }
            e = e >> 1;
            b = (b * b) % m;
        }
        return result;
    }
    public static void main(String[] args) {
        Backtracking obj = new Backtracking();
        System.out.println("2^10 mod 1000000007 = " + obj.modPow(2, 10, 1000000007));
        System.out.println("3^5 mod 1000000007 = " + obj.modPow(3, 5, 1000000007));
    }
}