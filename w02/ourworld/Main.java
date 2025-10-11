package ourworld;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        p1.temp1 = 100;
        p1.temp2 = 100;
        Point p2 = new Point(200);
        Point p3 = new Point(3, 5);
        Point p4 = p3;
        p4.setX(100);

        Point p5 = new Point(p3);
        p5.setX(500);

        System.out.println(p3.getX());
        System.out.println(p4.getX());
        System.out.println(p5.getX());

    }
}
