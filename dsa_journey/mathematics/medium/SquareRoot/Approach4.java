package dsa_journey.mathematics.medium.SquareRoot;

public class Approach4 {
    static int floorSqrt(int n) {

        int res = (int)Math.exp(0.5 * Math.log(n));
        
        if ((res + 1) * (res + 1) <= n) {
            res++;
        }
        
        return res;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(floorSqrt(n));
    }
}
