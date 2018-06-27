import java.util.Scanner;
public class Student02
{
    public String stuName;
    public int stuId;
    public int stuScoreHomework;
    public int stuScoreTest;
    public int stuScoreMidterm;
    public int stuScoreFinal;
    
    public String getGrade(String Grade , int ScoreTotal)
    {
        if(ScoreTotal>= 80){
            Grade = "A";
        }
        else if(ScoreTotal>= 70){
            Grade = "B";
        }
        else if(ScoreTotal>= 60){
            Grade = "C";
        }
        else if(ScoreTotal>= 50){
            Grade = "D";
        }
        else{
            Grade = "F";
        }
        return Grade;
    }
    public int getScoreTotal(int ScoreTotal)
    {
         ScoreTotal = stuScoreHomework + stuScoreTest + stuScoreMidterm + stuScoreFinal;
        return ScoreTotal;
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
    public int setScoreHomwork(int ScoreHomwork)
    {    
       Scanner scan = new Scanner(System.in);    
        System.out.print(" Enter ScoreHomework : ");
        int stuScoreHomework = scan.nextInt();
        return stuScoreHomework;
    }
    public int setScoreTest(int ScoreTest)
    {    
       Scanner scan = new Scanner(System.in);    
        System.out.print(" Enter ScoreTest : ");
        int stuScoreTest = scan.nextInt();
        return stuScoreTest;
       
    }
    public int setScoreMidterm(int ScoreMidterm)
    {    
       Scanner scan = new Scanner(System.in);    
        System.out.print(" Enter ScoreMidterm : ");
        int stuScoreMidterm = scan.nextInt();
        return stuScoreMidterm;
       
    }
    public int setScoreFinal(int ScoreFinal)
    {    
       Scanner scan = new Scanner(System.in);    
        System.out.print(" Enter ScoreFinal : ");
        int stuScoreFinal = scan.nextInt();
        return stuScoreFinal;
       
    }
}
