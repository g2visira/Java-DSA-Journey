package dsa_journey.mathematics.medium.SquareRoot;
public class Approach1 {
    public static int floorSqrt(int n) {
        int res = 1;
        while (res * res <= n) {
            res++;
        }
        return res - 1;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(floorSqrt(n));
    }
}