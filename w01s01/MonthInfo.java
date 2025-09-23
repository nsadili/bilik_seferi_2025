import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter month no: ");
        int month = scan.nextInt();

        // if (month == 1)
        // System.out.println("Jan 31");
        // else if (month == 2)
        // System.out.println("Feb 28");
        // else if (month == 3)
        // System.out.println("Mar 31");
        // // ...
        // else
        // System.out.println("No valid month no!");

        switch (month) {
            default:
                System.out.println("No valid month no!");
                break;
            case 1:
                System.out.println("Jan 31");
                break;
            case 2:
                System.out.println("Feb 28");
                break;
            case 3:
                System.out.println("Mar 31");
                break;
            // ...
            
        }

        scan.close();
    }
}
