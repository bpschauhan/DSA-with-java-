import java.util.*;

public class nestedloop10 {

    // row no. triangle 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int s = a-i+1;
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
               System.out.print(i);
               System.out.print(" ");
            }
            //for (int l = 1; l <= i; l++) {
             //   System.out.print(i);
            //
            //}
            
            System.out.println();
        }

    }
}
