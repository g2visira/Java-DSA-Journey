package dsa_journey.mathematics.easy;


public class OverlappingRectangles {
    static class Point{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void overlappingRectangles(Point l1, Point r1, Point l2, Point r2){
        //right - left
        if(r1.x<l2.x || r2.x<l1.x){
            System.out.println("Rectangle Don't Overlapped");
        }
        //top - bottom
        else if(l1.y<r2.y || l2.y<r1.y){
            System.out.println("Rectangle Don't Overlapped");
        }
        else{
            System.out.println("Rectangle Overlapped");
        }

    }
    public static void main(String[] args) {

        Point l1 = new Point(0, 10);
        Point r1 = new Point(10, 0);
        Point l2 = new Point(5, 5);
        Point r2 = new Point(15, 0);

        overlappingRectangles(l1, r1, l2, r2);
    }
}
