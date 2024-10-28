import java.util.*;


public class nestedloops6 {
    
    // floyd's triangle
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows do you want");
        int a = sc.nextInt();
        int k = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k+" ");
                k++ ;
            }
            System.out.println();
        }
    }
}
