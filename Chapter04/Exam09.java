import java.util.Scanner;
public class Exam09
{
    public static void main(String[] args) {      
        Scanner str = new Scanner(System.in);
   
        System.out.print("Enter your Math score : ");
        int score = str.nextInt();
        
        if (score < 0 || score > 100) {
            System.out.print("You must enter a correct score, try again later.");
        } else {
            
            if (score >= 80) {
                System.out.print("Your grade is A");
            } else if (score >= 70) {
                System.out.print("Your grade is B");
            } else if (score >= 60) {
                System.out.print("Your grade is C");
            } else if (score >= 50) {
                System.out.print("Your grade is D");
            } else {
                System.out.print("Your grade is F");
            }
            
        }
    }
}
