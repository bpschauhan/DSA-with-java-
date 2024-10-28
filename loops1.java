
import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input;
        System.out.println("give your marks");
        do {
            int b = sc.nextInt();
            if (b>=90) {
                System.out.println("shandaar");
            } else if (b>=60) {
                System.out.println("theek hai bhai");
            }
            else
            {
                System.out.println("chutiye ho tum");
            }
            System.out.println(" do you wnt to continue yess(1) no(0)");
            input =sc.nextInt();
        } while (input == 1);
    }
}