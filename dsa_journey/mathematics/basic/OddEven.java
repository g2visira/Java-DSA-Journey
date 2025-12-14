package dsa_journey.mathematics.basic;

public class OddEven{
    public static void main(String[] args) {

    int n1 = 68;
    int n2 = 95;

    System.out.println("Using Modulo:");
    System.out.println(n1 + " is even? " + checkEven(n1));
    System.out.println(n2 + " is even? " + checkEven(n2));

    System.out.println("\nUsing Bitwise AND:");
    System.out.println(n1 + " is even? " + checkEven2(n1));
    System.out.println(n2 + " is even? " + checkEven2(n2));

    }
    //1st way -> Naive Approach -> By Finding Remainder
    public static boolean checkEven(int n){
        return n % 2 == 0;
    }

    //2nd way -> Efficient Approach -> Using Bitwise AND(&) Operator
    public static boolean checkEven2(int n){
        return (n & 1) == 0;
    }
    /*
    last bit of all odd numbers is always 1, while for even numbers it’s 0.
    So, when performing bitwise AND operation with 1, odd numbers give 1, and even numbers give 0.
    Note: Bitwise operators are extremely fast and efficient because they operate directly at the binary level,
    making them significantly faster than arithmetic or logical operations.
    */
}