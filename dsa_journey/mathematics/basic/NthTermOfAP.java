package dsa_journey.mathematics.basic;

public class NthTermOfAP {
    //Naive Approach -> using for loop
    public static int nthTermOfAP(int a1, int a2, int n){
        int nthTerm = a1, d = a2 - a1;
        for (int i = 1; i < n; i++) {
            nthTerm += d;
        }
        return nthTerm;
    }

    //Efficient Approach -> using the nth term sum formula
    public static int nthTermOfAP2(int a1, int a2, int n){
        return (a1 + (n - 1) * (a2 - a1));
    }
    public static void main(String[] args) {
        int a1 = 2, a2 = 3;
        int n = 4;
        System.out.println(nthTermOfAP(a1, a2, n));
        System.out.println(nthTermOfAP2(a1, a2, n));
    }
}
