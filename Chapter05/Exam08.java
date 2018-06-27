
public class Exam08
{
    public static void main(String[] args) 
    {
       int number = 9;
 
        for (int i = 1; i <= number; i++) {
            for (int j = 2; j <= i; ++j) {
                System.out.print(" ");
            }
 
            if (i <= number) {
                System.out.print(i);
            }
            for (int j = 0; j <= i; ++j) {
                System.out.print(" ");
            }
 
            System.out.println();
        }
    }
}
