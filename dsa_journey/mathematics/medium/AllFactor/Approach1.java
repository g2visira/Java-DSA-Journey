package dsa_journey.mathematics.medium.AllFactor;

import java.util.ArrayList;

public class Approach1 {
    public static ArrayList<Integer> printDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
    public static void main(String[] args) {
        int number = 10;
        ArrayList<Integer> divisors = printDivisors(number);
        for (int div : divisors){
            System.out.print(div + " ");
        }
    }
}
