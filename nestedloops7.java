import java.util.*;

public class nestedloops7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
               int sum = i+j;
                if (sum%2==0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
          }
          System.out.println();
        }
    }
}
