import java.util.*;


public class nestedloop9 {

    // rombus
    
    public static void main (String[] args) {
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
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
