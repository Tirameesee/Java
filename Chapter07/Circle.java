import java.util.Scanner;
public class Circle
{
    public double radius;
    
    public double getCircleArea(double dblCircleArea)
    {
        Scanner scan = new Scanner(System.in);
         
        System.out.print(" Input value of radius : ");
        double radius = scan.nextDouble();
        return radius;
    }
    public double getBorderLength(double dblborderlength)
    {
        dblborderlength = ((2 * 3.14)*radius);
        return radius;
    }
    public double setRadius(double dblradiusArea)
    {    
        dblradiusArea = (3.14 * (radius*radius));
        
        return radius;
    }
}
