package geometry;

public class Rectangle extends Shape implements Resizable {
    protected double width;
    protected double height;

    public Rectangle() {
        // super();
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean isFilled) {
        super(color, isFilled);
        this.width = width;
        this.height = height;

        // super.color = color;
        // super.isFilled = isFilled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(int factor) {
        this.width *= factor;
        this.height *= factor;
    }

}
