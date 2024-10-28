import java.util.*;
class calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the first value");
        int a = sc.nextInt();
        System.out.println("give the symbol");
        int operator = sc.nextInt();
        System.out.println("give the another value");
        int b = sc.nextInt();

        switch (operator) {
            case 1: System.out.println(a+b);
                break;
            case 2: System.out.println(a-b);
                break;
            case 3: System.out.println(a*b);
            case 4: if (b==0) {
                System.out.println("invalid divide");
                } else {
                System.out.println(a/b);
            }
                break;
            case 5: if (b==0) {
                    System.out.println("invalid modulos");
                } else {
                    System.out.println(a%b);
                }
                break;
            default:
                System.out.println("invalid");
        }
    }
}