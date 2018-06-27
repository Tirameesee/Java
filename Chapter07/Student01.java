import java.util.Scanner;
public class Student01
{
    public String stuName;
    public int stuId;
    
    public double getGPA(double dblGPA)
    {
        Scanner scan = new Scanner(System.in);
         
        System.out.print(" Enter GPA : ");
        double GPA = scan.nextDouble();
        return GPA;
    }
    public String setName(String Name)
    {
        Scanner scan = new Scanner(System.in);    
        System.out.print(" Enter Name : ");
        String stuName = scan.nextLine();
        return stuName;
    }
    public int setId(int Id)
    {    
        Scanner scan = new Scanner(System.in);    
        System.out.print(" Enter Id : ");
        int stuId = scan.nextInt();
        return stuId;
    }
    public String setGradeMath(String GradeMath)
    {    
       String Grade = "A";
        GradeMath = Grade;
        return Grade;
       
    }
    public String setGradeCom(String GradeCom)
    {    
       String Grade = "B";
        GradeCom = Grade;
        return Grade;
       
    }
    public String setGradeEng(String GradeEng)
    {    
       String Grade = "B+";
        GradeEng = Grade;
        return Grade;
       
    }
}
