package geometry;

public class Rectangle extends Shape implements Resizable {
    protected double width;
    protected double height;

    public Rectangle() {
        // super();
    }

    public Rectangle(double width, double height) throws RectangleValidationException {
        super();
        setWidth(width);

        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean isFilled) throws RectangleValidationException {
        super(color, isFilled);
        setWidth(width);

        this.height = height;

        // super.color = color;
        // super.isFilled = isFilled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws RectangleValidationException {
        if (width <= 0)
            throw new RectangleValidationException(width + " is not a valid width");
        this.width = width;
    }

    public double getHeight() throws RectangleValidationException {
        if (height <= 0)
            throw new RectangleValidationException();
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

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

}
