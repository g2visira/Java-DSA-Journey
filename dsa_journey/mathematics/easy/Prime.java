package dsa_journey.mathematics.easy;

public class Prime {
    //Approach 1 -> Check until n
    public static boolean isPrime(int n){
        if(n<=1) return false;
        else{
            for(int i=2; i<n; i++){
                if(n%i==0) return false;
            }
            return true;
        }
    }

    //Approach 2 -> Check until n with optimization
    public static boolean isPrime2(int n){
        if(n<=1) return false;
        else{
            for(int i=2; i*i<=n; i++){
                if(n%i==0) return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(11));
        System.out.println(isPrime(15));
        System.out.println(isPrime(1));
        System.out.println(isPrime2(11));
        System.out.println(isPrime2(15));
        System.out.println(isPrime2(1));
    }
}
