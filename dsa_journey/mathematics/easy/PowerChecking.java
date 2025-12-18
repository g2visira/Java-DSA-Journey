package dsa_journey.mathematics.easy;

public class PowerChecking{
    //Naive Approach -> Repeated Multiplication
    public static boolean powerChecking(int x, long y){

        if (y < 1 || x < 1) return false;

        if(x==1) return y==1;
        
        long pow = 1;
        while (pow < y){
            pow *= x;
        }
        return (pow == y);
    }
    
    //Expected Approach -> Iterative Division Approach
    public static boolean powerChecking2(int x, int y){
        if (x == 1) return y == 1;
        if (x <= 0 || y <= 0) return false;
        while (y % x == 0){
            y /= x;
        } return y == 1;
    }
    public static void main(String[] args) {
        System.out.println(powerChecking(1, 1 ));
        System.out.println(powerChecking(10, 1000));
        System.out.println(powerChecking(10, 1001));
        System.out.println(powerChecking(10, 1));
        System.out.println("*********************");
        System.out.println(powerChecking2(1, 1 ));
        System.out.println(powerChecking2(10, 1000));
        System.out.println(powerChecking2(10, 1001));
        System.out.println(powerChecking2(10, 1));
    }
}