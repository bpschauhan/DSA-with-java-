import java.util.*;

public class loops 
// print all even no.
{
     public static void main(String[] args) 
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for (int i = 0; i < n;i = i+2) 
         {
             System.out.println(i);
         }
     }    
}
