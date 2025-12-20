package dsa_journey.mathematics.easy;

public class FactorialNumber {
    //Approach 1 -> Iterative Method
    public static int factorial(int n) {
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
    //Approach 2 -> Recursion Method
    public static int factorial2(int n){
        int res = 1, i;
        for (i = 2; i <= n; i++){
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial2(5));
    }
}
