package dsa_journey.mathematics.easy;

public class PairCubeCount {
    //Appraoch 1 -> Using Nested Loop
    public static int pairCubeCount(int n){
        int count = 0;
        for(int a=1; a<=n; a++){
            for(int b=1; b<=n; b++){
                if(a*a*a + b*b*b == n){
                    count++;
                }
            }
        }
        return count;
    }
    //Approach 2 -> Finding Diffirent Pairs
    public static int pairCubeCount2(int n){
        int count = 0;
        for(int i=1; i<=Math.cbrt(n); i++){
            int a = i*i*i;
            int b = n - a;
            int cbrtB = (int) Math.cbrt(b);
            if(cbrtB*cbrtB*cbrtB == b){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(pairCubeCount(9));
        System.out.println(pairCubeCount2(9));
    }
}
