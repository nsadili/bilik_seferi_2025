package geometry;

public abstract class Shape{
    protected String color;
    protected boolean isFilled;
    protected String name;

    public Shape() {
        // this.color = "red";
        // this.isFilled = true;
        this("red", true);
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public abstract double getArea();
}
