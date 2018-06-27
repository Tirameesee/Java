import java.util.Scanner;
public class Exam14
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = scan.nextInt();
        for (int row = 1; row <= num; ++row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print("*");
            }
 
            System.out.println();
        }
    }
}
