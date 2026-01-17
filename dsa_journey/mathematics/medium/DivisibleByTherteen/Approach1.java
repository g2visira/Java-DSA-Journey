package dsa_journey.mathematics.medium.DivisibleByTherteen;
public class Approach1 {
    public static boolean divBy13(String s) {
        int len = s.length();
        if (len == 1 && s.charAt(0) == '0') {
            return true;
        }
        if (len % 3 == 1) {
            s += "00";
            len += 2;
        } else if (len % 3 == 2) {
            s += "0";
            len += 1;
        }

        int sum = 0;
        int p = 1;

        for (int i = len - 1; i >= 0; i--) {
            int group = 0;
            group += s.charAt(i--) - '0';
            group += (s.charAt(i--) - '0') * 10;
            group += (s.charAt(i) - '0') * 100;

            sum += group * p;
            p *= -1;
        }

        sum = Math.abs(sum);
        return sum % 13 == 0;
    }

    public static void main(String[] args) {
        String s = "2911285";
        System.out.println(divBy13(s));
    }     
}