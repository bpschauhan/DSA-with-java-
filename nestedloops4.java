import java.util.*;

public class nestedloops4 {
    //inverted righi angle triangle
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. do you want in inverted righi angle triangle");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
