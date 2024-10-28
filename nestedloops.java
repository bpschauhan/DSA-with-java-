import java.util.*;

public class nestedloops 
{
    // solid rectangle 
    
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("please enter rows ");
      int a = sc.nextInt();
      System.out.println("please enter columns");
      int b = sc.nextInt();
      int i;
      int j;
      for (i=1; i<=a; i++) 
      {
          for (j=1; j<=b; j++) 
          {
              System.out.print("*");
          }
          System.out.println();
      }
  }
}