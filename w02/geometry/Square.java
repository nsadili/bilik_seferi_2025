package geometry;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean isFilled) {
        super(side, side, color, isFilled);
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }
}
