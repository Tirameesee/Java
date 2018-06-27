import java.util.Scanner;

public class Exam06
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner (System.in);
        System.out.print("Enter My Name : ");
        String name = str.nextLine();
        System.out.print("Enter My Birthday : ");
        String birth = str.nextLine();
        System.out.print("Enter My Age : ");
        int age = str.nextInt();
        System.out.print("Enter My High : ");
        float high = str.nextFloat();
        System.out.print("Enter My Weight : ");
        float weight = str.nextFloat();
        
        System.out.println("My Name is "+ name);
        System.out.println("Birthday : "+ birth + '\t' + "Age : " + age);
        System.out.print("High : "+ high + '\t' + "Weight : " + weight);
    }
}
