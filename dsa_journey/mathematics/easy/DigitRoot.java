package dsa_journey.mathematics.easy;

public class DigitRoot {
    //Approach 1 -> Repetitively Adding Digits
    public static int singleDigit(int n) {
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }

            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    //Approach 2 -> Using Mathematical Formula
    static int singleDigit2(int n) {
        if (n == 0) 
            return 0;
    
        if(n % 9 == 0)
            return 9;
     
        return (n % 9);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(singleDigit(n));
        System.out.println(singleDigit2(n));   
    }
}
