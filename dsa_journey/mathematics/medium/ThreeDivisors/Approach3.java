package dsa_journey.mathematics.medium.ThreeDivisors;

public class Approach3 {
    static int countExactly3Divisors(int n) {
        int count = 0;

        for (int i = 2; i * i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countExactly3Divisors(16));
        System.out.println(countExactly3Divisors(100));
        System.out.println(countExactly3Divisors(50));
    }
}
