package geometry;

public class Main {
    public static void main(String[] args) {

        var r1 = new Rectangle();
        var r2 = new Rectangle(5, 2);

        System.out.println(r1.getColor());
        System.out.println(r2.getColor());

        // var s = new Shape(); //abstract classes cannot be instantiated

        var s1 = new Square(5);
        System.out.println(s1.getArea());
    }
}
