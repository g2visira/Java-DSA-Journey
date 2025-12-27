package dsa_journey.mathematics.easy;
public class DecimalToBinary {
    //Approach 1 -> Division by 2
    public static String decToBinary(int n) {
        StringBuilder bin = new StringBuilder();

        while (n > 0) {
            int bit = n % 2;
            bin.append((char) ('0' + bit));
            n /= 2;
        }
        
        // reverse the string
        bin.reverse();
        return bin.toString();
    }
    //Approach 2 -> Using Recursion
    static void decToBinaryRec(int n, StringBuilder bin) {
        if (n == 0)
            return;

        decToBinaryRec(n / 2, bin);

        bin.append(n % 2);
    }
    public static String decToBinary2(int n) {
        if (n == 0)
            return "0";

        StringBuilder bin = new StringBuilder();
        decToBinaryRec(n, bin);
        return bin.toString();
    }
    //Approach 3 -> Using Bitwise Operator
    public static String decToBinary3(int n) {

        StringBuilder bin = new StringBuilder();

        while (n > 0) {

            int bit = n & 1;
            bin.append(bit);
            
            n = n >> 1;
        }

        return bin.reverse().toString();
    }
    //Appraoch 4 -> Using Built in Function
    public static String decToBinary4(int n) {
        return String.format("%s", Integer.toBinaryString(n));
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(decToBinary(n));
        System.out.println(decToBinary2(n));
        System.out.println(decToBinary3(n));
        System.out.println(decToBinary4(n));
    }
}