package dsa_journey.mathematics.basic;

public class ClosestNumber {
    //Expected Approach -> By finding Quotient
    public static int ClosestNum(int n, int m){
        if(m==0){
            System.out.print("Undefind because of : ");
            return 0;
        }
        else{
            int lower = (n/m) * m;
            int upper = (n>0) ? lower + m : lower - m;

            int a = Math.abs(n-lower);
            int b = Math.abs(n-upper);

            if(a<b) return lower;
            if(b<a) return upper;

            return (Math.abs(lower) > Math.abs(upper) ? lower : upper);
            
        }
    }
    public static void main(String[] args) {
        System.out.println(ClosestNum(13, 4));
        System.out.println(ClosestNum(-15, 6));
    }
}
