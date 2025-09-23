import java.util.Scanner;

class First {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Hello, Ganja!\n");

        int x, y;

        System.out.print("Please, enter X: ");
        x = scan.nextInt();
        System.out.print("Please, enter Y: ");
        y = scan.nextInt();

        int z = x + y;

        // System.out.println("Answer is " + z);
        // System.out.printf("Answer is %d\n", z);

        System.out.println(x + " + " + y + " = " + z);

        System.out.printf("%d + %d = %d\n", x, y, z);
    }
}