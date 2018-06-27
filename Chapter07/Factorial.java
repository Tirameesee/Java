import java.util.Scanner;
public class Factorial
{
    
    public void factorial(double dblfactorial)
    {
       Scanner scan = new Scanner(System.in);
      System.out.print("Please input n : ");
      
      int result = 1;
      int n = scan.nextInt();

      for (int i = n; i >= 1; i--) {
         result *= i;
      }

      System.out.println("Result = " + result);
   }
}
