import java.util.*;

public class nestedloop14 {

    // hollow rohmbus

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tell me row");
        int a = sc.nextInt();
        System.out.println("tell me columns");
        int b = sc.nextInt();

        for (int i=1; i<=a; i++) {
            for(int k=1; k<=(a-i); k++) {
                System.out.print(" ");
            }
            for (int j=1; j<=b; j++) {
                if (i==1 || j==1 || j==b || i==a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
