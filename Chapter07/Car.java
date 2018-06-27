
public class Car
{
    public double speed;
    public String status;
    public double start;
    public double stop;
    public double upSpeed;
    public double downSpeed;
    
    public void start(double dblstart)
    {
        start = dblstart;
    }
    public void stop(double dblstop)
    {
        stop = dblstop;
    }
    public void upSpeed(double dblstart)
    {
        start = start + dblstart;
        
    }
    public void downSpeed(double dbldownSpeed)
    {
        stop = stop - dbldownSpeed;
    }
}
