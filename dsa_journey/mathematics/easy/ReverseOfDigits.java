package dsa_journey.mathematics.easy;

public class ReverseOfDigits {
    //Approach 1 -> Digit Extraction
    public static int reverseDigits(int n){
        int ans = 0;
        while(n>0){
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        return ans;
    }
    //Approach 2 -> Using Recursion

        //For this problem, recursion doesn’t feel like the right approach right now, but I’ll implement it in the future.

    //Approach 3 -> String Conversion
    public static int reverseDigits3(int n){
        StringBuffer s = new StringBuffer(String.valueOf(n));
        s.reverse();
        return Integer.parseInt(String.valueOf(s));
    }
    public static void main(String[] args) {
        System.out.println(reverseDigits(4002));
        System.out.println(reverseDigits(400));
        System.out.println(reverseDigits3(4002));
        System.out.println(reverseDigits3(400));
    }
}
