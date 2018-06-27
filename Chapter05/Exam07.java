
public class Exam07
{
    public static void main(String[] args) 
    {
       for (int a = 9; a > 0; a--) {
            for (int b = a; b < 9; b++) {
                System.out.print(" ");
            }                   
            for (int b = 1; b <= a; b++) {
                System.out.print(b);
            }               
            for (int c = a-1; c >= 1; c--) {
                System.out.print(c);
            }            
            for (int c = a; c < 9; c++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
