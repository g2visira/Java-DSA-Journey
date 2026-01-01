package dsa_journey.mathematics.medium.SquareRoot;

public class Approach3 {
    public static int floorSqrt(int n) {
        int res = (int)Math.sqrt(n);
        return res;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(floorSqrt(n));
    }
}
