package generics;

public class GenericMethodDemo1 {
    public static void main(String[] args) {
        // print(3.0, 2.0, 5.0, 3.0, 65.0);
        // print("Aliya", "Mahammad", "Sadi");
        // print(2, "Yes", true);
        // print();

        GenericMethodDemo1.<Integer>print(3, 4, 5, (int) 'A');

        GenericMethodDemo1 gm1 = new GenericMethodDemo1();
        gm1.<String>print("Alpha", "Beta", "Gamma");

    }

    private static <X> void print(X... args) {
        if (args.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < args.length - 1; i++)
            System.out.print(args[i] + ", ");

        System.out.println(args[args.length - 1] + "]");
    }

}
