
public class Exam10
{
    public static void main(String[] args) {
        int n = 9;
 
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("");
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
        System.out.println();
    }
}
