package dsa_journey.mathematics.medium.kthDigitOfPower;

public class Approach {
    public static int kthDigit(int a, int b, int k) {
        long mod = (long) Math.pow(10, k);
        long res = 1;
        long base = a;

        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            b >>= 1;
        }
        for (int i = 1; i < k; i++)
            res /= 10;

        return (int)res;
    }

    public static void main(String[] args) {
        int a = 5, b = 2, k = 1;
        System.out.println(kthDigit(a, b, k));
    }
}
