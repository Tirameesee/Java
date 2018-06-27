
public class Exam12
{
    public static void main(String[] args) {
        int num = 9;
        int space = 0;
        for (int i = 1; i <= num; i++) {
                for (space = 1; space <= (num - i); space++) {
                    System.out.print(" ");
                }
 
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            space--;
        }
        for (int a = 9; a > 0; a--) {
            for (int b = a; b <= 9; b++) {
                System.out.print(" ");
            }                   
            for (int b = 1; b <= (a-1); b++) {
                System.out.print(b);
            }               
            System.out.println();
        }
    }
}
