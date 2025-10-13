package ourworld;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1,
            float x2, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Segment(Segment s) {
        this.p1 = new Point(s.p1);
        this.p2 = new Point(s.p2);
    }

    public boolean equals(Segment s) {
        // this and s are the ref.s
        return this.p1.equals(s.p1) && this.p2.equals(s.p2) ||
                this.p1.equals(s.p2) && this.p2.equals(s.p1);
    }
}
