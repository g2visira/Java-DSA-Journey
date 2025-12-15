package dsa_journey.mathematics.basic;

public class SumOfNaturals {
    //Naive Approach -> Using loop
    public static int naturalSum(int n){
        int ans = 0;
        if(ans==n){
            return ans;
        }
        else{
            while(n>=1){
                ans += n;
                n--;
            }
            return ans;
        }
    }

    //Alternative Approach -> Using Recursion

    //Expected Approach -> Using formula
    public static int naturalSum2(int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {

        System.out.println(naturalSum(5));
        System.out.println(naturalSum(0));

        System.out.println(naturalSum2(5));
        System.out.println(naturalSum2(0));

    }
}
