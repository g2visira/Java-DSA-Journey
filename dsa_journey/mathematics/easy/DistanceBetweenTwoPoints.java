package dsa_journey.mathematics.easy;

public class DistanceBetweenTwoPoints {
    //Approach 1 -> Pythagoren Theorem
    public static double distanceOfTwoPoints(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
    }
    //Appraoch 2 -> Using Math.hypot()
    public static double distanceOfTwoPoints2(int x1, int y1, int x2, int y2){
        return Math.hypot(x2-x1, y2-y1);
    }
    public static void main(String[] args) {
        System.out.println(distanceOfTwoPoints(3, 4, 4, 3));
        System.out.println(distanceOfTwoPoints2(3, 4, 4, 3));
    }
}
