package dsa_journey.mathematics.medium.CalculateNCR;
//[Better Approach - 1] Using Factorial
public class Approach3 {
    public static int nCr(int n, int r){
        
        double sum = 1;

        for (int i = 1; i <= r; i++) {
            sum = sum * (n - r + i) / i;
        }

        return (int)sum;
    }
    public static void main(String[] args){

        int n = 5;
        int r = 2;
        System.out.println(nCr(n,r));
    }
}
