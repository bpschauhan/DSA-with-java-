import java.util.*;

public class nestedloops8 {

    //butterfly

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int a = sc.nextInt();

        // upper half

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <=2*(a-i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <=2*(a-i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}