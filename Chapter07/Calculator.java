
public class Calculator
{
    public double squareArea;
    public double triangleArea;
    public double circleArea;
    
    public void squareArea(double dblsquareArea)
    {
        double weight = 0.0;
        double high = 0.0;
        squareArea = dblsquareArea;
        squareArea =weight * high ;
    }
    public void triangleArea(double dbltriangleArea)
    {
        double weight = 0.0;
        double high = 0.0;
        triangleArea = dbltriangleArea;
        triangleArea = 0.5 * (weight * high) ;
    }
    public void circleArea(double dblcircleArea)
    {
        double radius = 0.0;
        final double pi = 3.14;
        double sum = (radius * radius);
        double total = (sum * pi);
        circleArea = dblcircleArea;
    }
    }

