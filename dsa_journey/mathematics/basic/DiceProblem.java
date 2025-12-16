package dsa_journey.mathematics.basic;

public class DiceProblem {
    //Naive Approch -> Using if-else
    public static int dice(int n){
        if(n<1 || n>6){
            System.out.print("Wrong Input : ");
            return n;
        }
        else{
            if(n==1){
                return 6;
            }
            else if(n==2){
                return 5;
            }
            else if(n==3){
                return 4;
            }
            else if(n==4){
                return 3;
            }
            else if(n==5){
                return 2;
            }
            else{
                return 1;
            }
        }
    }

    //Efficient Approach -> Using sum of two sides
    public static int dice2(int n){
        if(n<1 || n>6){
            System.out.print("Wrong Input : ");
            return n;
        }
        else{
            int ans = 7 - n;
            return ans;
        }
    }
    public static void main(String[] args) {
        System.out.println(dice(5));
        System.out.println(dice(6));
        System.out.println(dice(7));

        System.out.println("***********************");

        System.out.println(dice2(5));
        System.out.println(dice2(6));
        System.out.println(dice2(7));
    }
}
