import java.util.Scanner;
public class Exam15
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = scan.nextInt();
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= num;
        }
        System.out.println(num + " ^ " + num + " = " + sum);
    }
}
