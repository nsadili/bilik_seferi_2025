package geometry;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) throws RectangleValidationException {
        super(side, side);
    }

    public Square(double side, String color, boolean isFilled) throws RectangleValidationException {
        super(side, side, color, isFilled);
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side) throws RectangleValidationException{
        setWidth(side);
        setHeight(side);
    }
}
