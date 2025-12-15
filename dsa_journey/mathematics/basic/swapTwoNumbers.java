package dsa_journey.mathematics.basic;

public class swapTwoNumbers {
    public static void main(String[] args) {

        int a = 2, b = 3;
        System.out.println("a = " + a + " b = " + b);   
      
        // Swap a and b using temp variable (Naive Approach)
        int temp = a;
        a = b;
        b = temp;
      
        System.out.println("a = " + a + " b = " + b);

        // Swap again a and b using arithmetic operator (Expected Appraoch)
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + " b = " + b);
        
        // Swap again a and b using bitwise XOR operator (Expected Approach 2)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a + " b = " + b);
        
    }
}
