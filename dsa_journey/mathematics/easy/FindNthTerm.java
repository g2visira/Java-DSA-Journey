package dsa_journey.mathematics.easy;

public class FindNthTerm {
    //Qustion -> Find n-th term of series 1, 3, 6, 10, 15, 21...

    //Approach 1 -> Using loop
    public static int term(int n){
        int ans = 0;
        for (int i = 1; i <= n; i++) 
            ans += i; 
        
        return ans;
    }
    //Approach 2 -> Using formula
    public static int term2(int n){
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        System.out.println(term(1));
        System.out.println(term2(2));
        System.out.println(term(3));
        System.out.println(term2(4));
        System.out.println(term(5));
        System.out.println(term2(6));
        System.out.println(term(7));
        System.out.println(term2(8));
    }
}
