package dsa_journey.mathematics.basic;

public class SumOfSquaresNaturals {
    //Naive Approach -> Adding one by one
    public static int sumOfSquares(int n){
        if(n==0){
            return n;
        }
        else{
            int ans = 0;
            while (n>=1) {
                ans += n*n;
                n--;
            }
            return ans;
        }
    }

    //Effected Approach -> Using Mathematical Formula
    public static int sumOfSquares2(int n){
        return (n*(n+1)*(2*n+1))/6;
    }
    public static void main(String[] args) {
        
        System.out.println(sumOfSquares(5));
        System.out.println(sumOfSquares(0));
        System.out.println(sumOfSquares2(5));
        System.out.println(sumOfSquares2(0));

    }
}
