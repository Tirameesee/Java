
public class Exam09
{
    public double speed;
    public double status;
    public double gear;
    public double start(double dblstart)
    {
        speed = dblstart;
        return speed;
    }
    public double stop(double dblstop)
    {
        speed = dblstop;
        return speed;
    }
    public double upSpeed(double dblupSpeed)
    {
        speed = dblupSpeed*speed;
        return speed;
    }
    public double downSpeed(double dbldownSpeed)
    {
        speed = dbldownSpeed*speed;
        return speed;
    }
    public double setGear_D(double dblsetGear_D)
    {
        gear = dblsetGear_D;
        return gear;
    }
    public double setGear_R(double dblsetGear_R)
    {
        gear = dblsetGear_R;
        return gear;
    }
    public double setGear_P(double dblsetGear_P)
    {
        gear = dblsetGear_P;
        return gear;
    }
    public double setGear_N(double dblsetGear_N)
    {
        gear = dblsetGear_N;
        return gear;
    }
}
