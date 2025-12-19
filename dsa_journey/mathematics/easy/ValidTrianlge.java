package dsa_journey.mathematics.easy;

public class ValidTrianlge {
    public static boolean validTrianlge(int a, int b, int c){
        return a+b>c && a+c>b && b+c>a;
    }
    public static void main(String[] args) {
        boolean ans = validTrianlge(7, 10, 5);
        boolean ans2 = validTrianlge(1, 10, 12);

        if(ans){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
        if(ans2){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
