import java.util.Scanner;

public class Exam09
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner (System.in);
        System.out.print("Enter the income is yearly : ");
        double income = str.nextDouble();
        final double tax = 0.05;
        double sum = (income * tax);
        
        System.out.println("The income is yearly : "+ sum);
    }
}
