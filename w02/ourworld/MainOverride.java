package ourworld;

public class MainOverride {
    public static void main(String[] args) {

        Point noqte1 = new Point(3, 5, "Noqte1");
        Point noqte2 = new Point(3, 5, "Noqte2");
        Point noqte3 = noqte2;
        Point noqte4 = new Point(2, 6);

        // System.out.println(noqte1 == noqte2);
        // System.out.println(noqte2 == noqte3);

        System.out.println(noqte1.equals(new String("Salam")));
        System.out.println(noqte1.equals(noqte2));

        // 3,5 ve 2,6
        // var s1 = new Segment(noqte2, noqte4);
        // 2,6 ve 3,5
        // var s2 = new Segment(noqte4, noqte1);

        // System.out.println(s1.equals(s2));
    }
}
