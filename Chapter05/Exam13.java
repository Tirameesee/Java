import java.util.Scanner;
public class Exam13
{
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter Number : ");
      int num = scan.nextInt();

      for (int i = 1; i <= 12; i++) {
         System.out.println(i + " * " + num + " = " + (i * num));
      }
   }
}
