import java.util.Scanner;

public class Exam12
{
    public static void main(String[] args)
    {
       Scanner str = new Scanner(System.in);
   
       System.out.print("Enter your number : ");
       int number = str.nextInt();
 
       if (number >= 1) {
           System.out.print("Number is positive");
       } else if (number == 0) {
           System.out.print("Number is zero");
       } else if (number < 0) {
           System.out.print("Number is negative");
       }
            
    }
}
