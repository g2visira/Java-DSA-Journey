package dsa_journey.mathematics.easy;
public class PalindromeNumber {
    //Approach 1 -> By Reversing Number
    public static boolean isPalindrome(int n) {
        int reverse = 0;
        int temp = Math.abs(n);
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == Math.abs(n));
    }
    //Approach 2 -> Using Number as a String
    public static boolean isPalindrome2(int n) {
        String s = Integer.toString(Math.abs(n));
        int len = s.length();

        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 12321;
        if (isPalindrome(n) == true) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        if (isPalindrome2(n) == true) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}