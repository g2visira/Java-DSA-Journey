package dsa_journey.mathematics.basic;

public class MultiplicationTable {
    public static void main(String[] args) {
        numTable(5);
    }
    // Approach 1 -> Iterative Approach!!
    public static void numTable(int n){
        int multi = 1;
        while(multi<=10){
            int ans = n * multi;
            System.out.println(n + " * " + multi + " = " + ans);
            multi++;
        }
        
    }
    // Approach 2 -> Recursive Approach!!
}
