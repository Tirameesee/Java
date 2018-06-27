import java.util.Scanner;

public class Exam05
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner (System.in);
        System.out.print("กรุณาเลขบัตรประจำตัวสอบ : ");
        int code = str.nextInt();
        System.out.print("กรุณาใส่เลขที่นั่งสอบ : ");
        int seat = str.nextInt();
        System.out.print("กรุณาใส่รหัสวิชาสอบ : ");
        int subject = str.nextInt();
        
        System.out.print("M725"+ '\t' + code + '\t' + seat + '\t' + subject);
    }
}
