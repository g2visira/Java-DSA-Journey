package dsa_journey.mathematics.medium.CalculateNCR;
//[Expected Approach] By using Binomial Coefficient formula
public class Approach2 {
    static int nCr(int n, int r) {
        
        if (r > n) 
            return 0;
        return fact(n) / (fact(r) * fact(n - r));
    }

    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }
    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println(nCr(n, r));
    }
}
