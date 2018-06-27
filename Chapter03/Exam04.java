import java.util.Scanner;

public class Exam04
{
    public static void main(String[] args)
    {
        double Grade;
        Scanner str = new Scanner (System.in);
        System.out.print("กรุณาใส่รหัสนักศึกษา : ");
        String code = str.nextLine();
        System.out.print("กรุณาใส่ชื่อนักศึกษา : ");
        String name = str.nextLine();
        System.out.print("กรุณาใส่เกรดเฉลี่ยนักศึกษา : ");
        Grade = str.nextDouble();
        
        System.out.print(code + '\t' + name + '\b' + Grade);
    }
}
