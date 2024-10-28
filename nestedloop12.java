import java.util.*;

public class nestedloop12 {

    // diamond

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int a = sc.nextInt();
        
        // upper half

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=a-i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
            }
            for (int k = 1; k <=i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //lower half

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=a-i+1; k++) {
                System.out.print("*");
            }
            for (int k = 1; k <=a-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // type 2nd to make diamond 
        //upper half

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=a-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <=a-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
