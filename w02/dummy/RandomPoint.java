package dummy;
public class RandomPoint {
    public static void main(String[] args) {

        double x, y;
        int n = 5;
        int count = 0;

        for (int i = 0; i < n; i++)
            while (true) {
                x = Math.random();
                y = Math.random();

                if (x * x + y * y <= 1) {
                    System.out.println(x + ", " + y);
                    break;
                }
            }

    }
}
