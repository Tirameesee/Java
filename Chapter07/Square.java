import java.util.Scanner;
public class Square
{
    public double width;
    public double length;
    
    public double getsquareArea(double dblsquareArea)
    {
        Scanner scan = new Scanner(System.in);
         
        System.out.print(" Input value of width : ");
        double width = scan.nextDouble();
        return width;
    }
    public double getBorderLength(double dblborderlength)
    {
        Scanner scan = new Scanner(System.in);    
        System.out.print(" Input value of length : ");
        double length = scan.nextDouble();
        return length;
    }
    public double setwidth(double dblsquareArea)
    {    
        dblsquareArea = width * length;
        return width;
    }
    public double setlength(double dblborderlength)
    {    
       dblborderlength = ((2 * width)+(2*length));
        return length;
       
    }
    
    
}
