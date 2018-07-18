
public class sphere
{
    public double radius;
    public double sphereCapacity;
    public double sphereSurfaceArea;
    public double getSphereCapacity(double dblSphereCapacity)
    {
        dblSphereCapacity = ((4/3)*(3.14*((radius*radius)*radius)));
        sphereCapacity = dblSphereCapacity;
        return sphereCapacity;
    }
    public double getSphereSurfaceArea(double dblSphereSurfaceArea)
    {
        dblSphereSurfaceArea = (4*(3.14*(radius*radius)));
        sphereSurfaceArea = dblSphereSurfaceArea;
        return sphereSurfaceArea;
    }
    public double getRadius(double dblRadius)
    {
        radius = dblRadius;
        return radius;
    }
    public sphere()
    {
        radius = 10;
    }
}
