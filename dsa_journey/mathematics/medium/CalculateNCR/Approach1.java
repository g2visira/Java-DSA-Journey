package dsa_journey.mathematics.medium.CalculateNCR;
//[Naive Approach] Using Recursion
public class Approach1 {
    public static int nCr(int n, int r) {
      
        if (r > n) 
            return 0;
      
        if (r == 0 || r == n) 
            return 1;
      
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(nCr(n, r)); 
    }
}
