package dsa_journey.mathematics.easy;
import java.math.BigInteger;

public class GcdOfTwoNumbers {
    //Approach 1 -> Using Loop
    public static int gcd(int a, int b){
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }
    //Approach 2 -> Euclidean Algorithm using Subtraction
    public static int gcd2(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        if (a == b)
            return a;

        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
    //Approach 3 -> Modified Euclidean Algorithm using Subtraction by Checking Divisibility
    public static int gcd3(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;

        if (a > b) {
            if (a % b == 0)
                return b;
            return gcd(a - b, b);
        }

        if (b % a == 0)
            return a;
        return gcd(a, b - a);
    }
    //Approach 4 -> Optimized Euclidean Algorithm by Checking Remainder
    static int gcd4(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
    //Approach 5 -> Using Built-in Function
    static int gcd5(int a, int b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }
    public static void main(String[] args) {
        System.out.println(gcd(36, 60));
        System.out.println(gcd2(36, 60));
        System.out.println(gcd3(36, 60));
        System.out.println(gcd4(36, 60));
        System.out.println(gcd5(36, 60));
        
    }
}
