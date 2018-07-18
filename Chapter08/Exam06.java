
public class Exam06
{
    public double radius;
    public float radiuss;
    public double sphereCapacity;
    public double SquareArea;
    public double getSphereCapacity(double dblSphereCapacity)
    {
        dblSphereCapacity = ((4/3)*(3.14*((radius*radius)*radius)));
        sphereCapacity = dblSphereCapacity;
        return sphereCapacity;
    }
    public double getSquareArea(double dblSquareAreaWidth, double dblSquareAreaLength, double dblSquareAreaHigh)
    {
        SquareArea = dblSquareAreaWidth*dblSquareAreaLength*dblSquareAreaHigh;
        return SquareArea;
    }
    public double getRadius(double dblRadius)
    {
        radius = dblRadius;
        return radius;
    }
    public float getRadius(float fltRadius)
    {
        radiuss = fltRadius;
        return radiuss;
    }
}
