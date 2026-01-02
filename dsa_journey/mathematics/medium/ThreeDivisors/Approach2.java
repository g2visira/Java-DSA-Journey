package dsa_journey.mathematics.medium.ThreeDivisors;

import java.util.Arrays;

public class Approach2 {
    static int countExactly3Divisors(int n) {
        int limit = (int) Math.sqrt(n);
        boolean[] prime = new boolean[limit + 1];
        Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= limit; i++) {
            if (prime[i]) count++;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(countExactly3Divisors(16));
        System.out.println(countExactly3Divisors(100));
        System.out.println(countExactly3Divisors(50));
    }
}
