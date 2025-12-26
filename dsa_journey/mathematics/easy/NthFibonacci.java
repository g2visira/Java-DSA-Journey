package dsa_journey.mathematics.easy;

public class NthFibonacci {
    //Approach 1 -> Using recursion
    public static int nthFibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }
    //Appraoch 2 -> Bottom Up Approach
    public static int nthFibonacci2(int n) {
        if (n <= 1) return n;
      
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
    //Approach 3 -> Space Optimized Approach
    public static int nthFibonacci3(int n) {
        if (n <= 1) return n;

        int curr = 0;

        int prev1 = 1;
        int prev2 = 0;

        for (int i = 2; i <= n; i++) {
          
            curr = prev1 + prev2;

            prev2 = prev1;

            prev1 = curr;
        }

        return curr;
    }
    // Approach 4 -> Using Golden Ratio
    static double PHI = 1.6180339;
    
    static int f[] = { 0, 1, 1, 2, 3, 5 };
    
    public static int nthFibonacci4 (int n)
    {
        if (n < 6){
            return f[n];
        }
            
        int t = 5;
        int fn = 5;
    
        while (t < n) {
            fn = (int)Math.round(fn * PHI);
            t++;
        }
    
        return fn; 
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(n + "th Fibonacci Number = " +nthFibonacci4(n));
        System.out.println(n + "th Fibonacci Number = " +nthFibonacci3(n));
        System.out.println(n + "th Fibonacci Number = " +nthFibonacci2(n));
        System.out.println(n + "th Fibonacci Number = " +nthFibonacci(n));
    }
}
