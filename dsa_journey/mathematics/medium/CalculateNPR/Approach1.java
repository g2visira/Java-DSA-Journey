package dsa_journey.mathematics.medium.CalculateNPR;

public class Approach1 {
    static long fact(int n){
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static long nPr(int n, int r){
        return fact(n) / fact(n - r);
    }
    public static void main(String[] args){
        int n = 5;
        int r = 2;

        System.out.println(n + "P" + r + " = " + nPr(n, r));
    }
}
