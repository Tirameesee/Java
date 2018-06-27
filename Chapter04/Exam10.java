import java.util.Scanner;

public class Exam10
{
    public static void main(String[] args)
    {
       Scanner str = new Scanner(System.in);
   
        System.out.print("Enter your income : ");
        int income = str.nextInt();
        
        if (income < 0 ) {
            System.out.print("You must enter a correct income, try again later.");
        } else {
            
            if (income >= 4000000) {
                double tax = 0.37;
                double sum = (income*tax);
                System.out.print("Your tax is : " + sum);
            } else if (income >= 1000000) {
                double tax = 0.3;
                double sum = (income*tax);
                System.out.print("Your tax is : " + sum);
            } else if (income >= 400000) {
                double tax = 0.2;
                double sum = (income*tax);
                System.out.print("Your tax is : " + sum);
            } else if (income >= 100000) {
                double tax = 0.1;
                double sum = (income*tax);
                System.out.print("Your tax is : " + sum);
            } else {
                double tax = 0.05;
                double sum = (income*tax);
                System.out.print("Your tax is : " + sum);
            }
            
        }
    }
}
