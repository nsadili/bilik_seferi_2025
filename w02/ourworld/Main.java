package ourworld;

public class Main {
    public static void main(String[] args) {

        Point noqte1 = new Point(3, 5);
        Point noqte2 = new Point(2, 1);

        var s1 = new Segment(noqte1, noqte2);
        var s2 = new Segment(3, 5, 2, 1);
        var s3 = new Segment(s2);

        // Point p1 = new Point();
        // p1.temp1 = 100;
        // p1.temp2 = 100;
        // Point p2 = new Point(200);
        // Point p3 = new Point(3, 5);
        // Point p4 = p3;
        // p4.setX(100);

        // Point p5 = new Point(p3);
        // p5.setX(500);

        // System.out.println(p3.getX());
        // System.out.println(p4.getX());
        // System.out.println(p5.getX());

    }
}
