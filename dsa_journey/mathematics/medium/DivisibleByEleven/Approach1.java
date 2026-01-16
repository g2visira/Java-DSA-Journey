package dsa_journey.mathematics.medium.DivisibleByEleven;

public class Approach1 {
    public static boolean divBy11(String s) {
        int n = s.length();
        int oddDigSum = 0, evenDigSum = 0;

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            
            if (i % 2 == 0)
                oddDigSum += digit;
            else
                evenDigSum += digit;
        }
        return (oddDigSum - evenDigSum) % 11 == 0;
    }
    public static void main(String[] args) {
        String s = "1234567589333892";
        System.out.println(divBy11(s) ? "true" : "false");
    }
}
