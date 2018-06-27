import java.util.Scanner;
public class Exam06
{
    public static void main(String[] args) 
    {
       Scanner str = new Scanner (System.in);
        System.out.print("Enter Comment : ");
        String comment = str.nextLine();
       String temp[] = new String[29];
        temp[0] = comment;
        int count = comment.length();
       
        System.out.println("Answer is : "+ comment + " and have " + count + " character");
    }
}
