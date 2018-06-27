import java.util.Scanner;

public class Exam02
{
    public static void main(String[] args)
    {
        
       
        Scanner str = new Scanner (System.in);
        System.out.print("กรุณาใส่ชื่อ - สกุล : ");
        String name = str.nextLine();
        
        
        System.out.print("กรุณาใส่ วัน/เดือน/ปี เกิด : ");
        String date = str.nextLine();
        
        System.out.println("ชื่อ - สกุล : " + name);
        System.out.print("วัน/เดือน/ปี เกิด : " + date);
    }
}
