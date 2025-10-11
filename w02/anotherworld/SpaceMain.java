package anotherworld;

import ourworld.Point;

public class SpaceMain {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(7, 9);
        Point p3 = new Point(3, 4);
        Point p4 = p3;

        System.out.println("Result = " + p1.distance(p2));

        // p1.equals(p2); -> false;
        // p1.equals(p3); -> //true

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p3 == p4);
    }
}
