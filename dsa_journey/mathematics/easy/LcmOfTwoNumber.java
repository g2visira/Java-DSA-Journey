package dsa_journey.mathematics.easy;

public class LcmOfTwoNumber {
    //Appraoch 1 -> Using Conditional Loop
    public static int lcm2(int a, int b) {
        
        int g = Math.max(a, b); 
        int s = Math.min(a, b);

        for (int i = g; i <= a * b; i += g) {
            if (i % s == 0)
                return i;
        }
        return a * b; 
    }
    //Appraoch 2 -> Using GCD LCM Formula
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
    public static void main(String[] args) {
        System.out.println(lcm(5, 11));
        System.out.println(lcm2(5, 11));
    }
}
