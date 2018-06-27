import java.util.Scanner;

public class Exam11
{
    public static void main(String[] args)
    {
       Scanner str = new Scanner(System.in);
   
        System.out.print("Enter your month number 1-12 : ");
        int num = str.nextInt();
        
        if (num <= 0 || num > 12) {
            System.out.print("You must enter a correct num, try again later.");
        } else {
            
            if (num == 1) {
                System.out.print("Your month is January");
            } else if (num == 2) {
                System.out.print("Your month is February");
            } else if (num == 3) {
                System.out.print("Your month is March");
            } else if (num == 4) {
                System.out.print("Your month is April");
            } else if (num == 5) {
                System.out.print("Your month is May");
            } else if (num == 6) {
                System.out.print("Your month is June");
            } else if (num == 7) {
                System.out.print("Your month is July");
            } else if (num == 8) {
                System.out.print("Your month is August");
            } else if (num == 9) {
                System.out.print("Your month is September");
            } else if (num == 10) {
                System.out.print("Your month is October");
            } else if (num == 11) {
                System.out.print("Your month is November");
            } else {
                System.out.print("Your month is December");
            }
            
        }
    }
}
