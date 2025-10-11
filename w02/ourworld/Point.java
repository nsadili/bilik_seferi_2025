package ourworld;

public class Point {
    private float x;
    private float y;
    float temp1;
    public float temp2;

    // default constructor
    public Point() {
        this(5, 5);
    }

    public Point(float x, float y) {
        this.x = x;
        if (y < 0)
            y = 0;
        this.y = y;
    }

    public Point(float y) {
        this(0, y);
    }

    // copy constructor
    public Point(Point point) {
        this(point.x, point.y);
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

    public void translate(float dX, float dY) {
        this.x = this.x + dX;
        this.y += dY;
    }

    public String stringeCevir() {
        return "(" + this.x + ", " + this.y + ")";
    }


    public float distance(Point p2) {
        return (float)  Math.hypot(p2.x - this.x, p2.y - this.y);

       //return (float) Math.sqrt( Math.pow(p2.x - this.x, 2) + Math.pow(p2.y-this.y, 2));
    }
}
