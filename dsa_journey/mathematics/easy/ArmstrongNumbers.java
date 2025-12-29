package dsa_journey.mathematics.easy;
public class ArmstrongNumbers {
    //Approach 1 -> Naive Approach
    public static int power(int x, int y) {
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        return x * power(x, y / 2) * power(x, y / 2);
    }
    public static int order(int n) {
        int t = 0;
        while (n != 0) {
            t++;
            n = n / 10;
        }
        return t;
    }
    public static boolean armstrong(int n) {
        int x = order(n);
        int temp = n, sum = 0;

        while (temp != 0) {
            int r = temp % 10;
            sum += power(r, x);
            temp = temp / 10;
        }

        return sum == n;
    }
    //Approach 2 -> Using Numeric String
    public static boolean armstrong2(int n) {
        String number = Integer.toString(n);

        int length = number.length();
        int output = 0;

        for (char c : number.toCharArray()) {
            output += (int) Math.pow(c - '0', length);
        }

        if (output == Integer.parseInt(number))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int n = 153;
        if (armstrong(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (armstrong2(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}