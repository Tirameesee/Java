
public class Exam09
{
    public static void main(String[] args) 
    {
        int num = 9;
        int space = 0;
        for (int i = 1; i <= num; i++) {
                for (space = 1; space <= (num - i); space++) {
                    System.out.print(" ");
                }
 
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
 
                for (int k = (i - 1); k >= 1; k--) {
                    System.out.print(k);
                }
 
                System.out.println();
            space--;
        }
    }
}
