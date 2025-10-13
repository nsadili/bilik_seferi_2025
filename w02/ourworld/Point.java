package ourworld;

import java.util.HashMap;
import java.util.List;

public class Point {
    private float x;
    private float y;
    private String name;
    float temp1;
    public float temp2;

    // default constructor
    public Point() {
        this(5, 5);
    }

    public Point(float x, float y) {
        this(x, y, "Unknown");
    }

    public Point(float y) {
        this(0, y);
    }

    // copy constructor
    public Point(Point point) {
        this(point.x, point.y, point.name);
    }

    public Point(float x, float y, String name) {
        this.x = x;
        if (y < 0)
            y = 0;
        this.y = y;
        this.name = name;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void translate(float dX, float dY) {
        this.x = this.x + dX;
        this.y += dY;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public float distance(Point p2) {
        return (float) Math.hypot(p2.x - this.x, p2.y - this.y);

        // return (float) Math.sqrt( Math.pow(p2.x - this.x, 2) + Math.pow(p2.y-this.y,
        // 2));
    }

    public boolean equals(Object obj) {
        // if (obj.getClass() != this.getClass())
        // return false;
        if (!(obj instanceof Point))
            return false;

        Point p = (Point) obj;
        return this.x == p.x && this.y == p.y;
    }
}
