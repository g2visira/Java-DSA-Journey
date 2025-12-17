package dsa_journey.mathematics.easy;

public class SumOfDigits {
    //Approach 1 -> Digit Extraction
    public static int sumOfDigits(int n){
        int ans = 0;
        while(n>0){
            int last = n % 10;
            ans += last;
            n /= 10;
        }
        return ans;
    }
    //Approach 2 -> Using Recursion
    public static int sumOfDigits2(int n){
        if(n==0) return 0;
        return (n%10) + sumOfDigits2(n/10);
    }
    //Approach 3 -> String Conversion
    public static int sumOfDigits3(int n){
        String s = Integer.toString(n);
        int sum = 0;
        for(char ch : s.toCharArray()){
            sum += ch - '0';
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(687));
        System.out.println(sumOfDigits2(687));
        System.out.println(sumOfDigits3(687));
    }
}
