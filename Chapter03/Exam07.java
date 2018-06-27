import java.util.Scanner;

public class Exam07
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner (System.in);
        System.out.print("Enter High : ");
        float high = str.nextFloat();
        System.out.print("Enter Weight : ");
        float weight = str.nextFloat();
        float sum = ((high * weight) /2);
        
        System.out.println("Answer is : "+ sum);
    }
}
