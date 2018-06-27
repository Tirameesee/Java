import java.util.Scanner;

public class Exam01
{
    public static void main(String[] args)
    {
        int code;
       
        Scanner str01 = new Scanner (System.in);
        System.out.print("กรุณาใส่รหัสนักศึกษา : ");
        code = str01.nextInt();
        
        Scanner str02 = new Scanner (System.in);
        System.out.print("กรุณาใส่ชื่อนักศึกษา : ");
        String name = str02.nextLine();
        
        System.out.println("รหัสนักศึกษา : " + code);
        System.out.print("ชื่อนักศึกษา : " + name);
    }
}
