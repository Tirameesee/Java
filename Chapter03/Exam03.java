import java.util.Scanner;

public class Exam03
{
    public static void main(String[] args)
    {
        
       
        Scanner str = new Scanner (System.in);
        System.out.print("กรุณาใส่ชื่อ - สกุล : ");
        String name = str.nextLine();
        
        System.out.print("กรุณาใส่เบอร์โทรศัพท์ : ");
        String num = str.nextLine();
        
        System.out.print(name + '\t' + num);
    }
}
