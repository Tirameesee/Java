import java.util.Scanner;

public class Exam08
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner (System.in);
        System.out.print("Enter Radius : ");
        double radius = str.nextDouble();
        final double pi = 3.14;
        double sum = (radius * radius);
        double total = (sum * pi);
        
        System.out.println("Answer is : "+ total + " or π" + sum);
    }
}
