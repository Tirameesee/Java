import java.util.Scanner;

public class Exam08
{
    public static void main(String[] args)
    {
       Scanner str = new Scanner (System.in);
       System.out.print("Enter your massage : ");
       String massage = str.nextLine();
       String output ="";
             for(int i = 0 ; i < massage.length() ;i++){
                   char c = massage.charAt(i);
                 if(Character.isDigit(c)){
                    output = "Integer";
                 } else {
                    output = "Character";
                 }
             }
         System.out.println("Your massage is : " +output);
    }
}
