package atlas3i;

public class Main {
    public static void main(String[] args) {
        // 3,5
        // var m = new Math();
        // System.out.println(Math.min(3, 5));

        Dummy d1 = new Dummy();
        Dummy d2 = new Dummy();

        d1.a = 100;
        d2.b = 200;

        System.out.println(Dummy.a);
        System.out.println(d1.a + ", " + d1.b);
        System.out.println(d1.a + ", " + d2.b);

    }
}