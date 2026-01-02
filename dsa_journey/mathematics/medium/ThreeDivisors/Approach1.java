package dsa_journey.mathematics.medium.ThreeDivisors;

public class Approach1 {
    static int countExactly3Divisors(int n){
        int ans = 0;
        for(int i=1; i<=n; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0) count++;
            }
            if(count==3) ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(countExactly3Divisors(16));
        System.out.println(countExactly3Divisors(100));
        System.out.println(countExactly3Divisors(50));
    }
}
