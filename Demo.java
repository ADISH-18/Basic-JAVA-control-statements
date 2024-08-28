
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number");
        int num = sc.nextInt(), i = 1;
        if (num > 0) {
            System.out.println("Positive Number");
            switch (num) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Enter a Value between 1 and 7");
            }
            while (i <= num) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
            for (int j = num; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            i = 1;
            do {
                System.out.print(i + " ");
                i++;
            } while (i < 4);
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
