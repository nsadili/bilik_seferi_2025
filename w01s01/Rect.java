import java.util.Scanner;

class Rect {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width, height;

        System.out.print("Width: ");
        width = scan.nextInt();
        System.out.print("Height: ");
        height = scan.nextInt();

        int area = width * height;
        int per = 2 * (width + height);

        // "Area of [3,5] rect is 15"
        // System.out.printf("Area of [%d, %d] rect is %d\n",
        // width, height, area);

        // System.out.printf("Per of [%d, %d] rect is %d\n",
        // width, height, per);

        System.out.println("Area of ["+width+", "+height+"] rect is \n"+area);
    }

}
