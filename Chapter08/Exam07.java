
public class Exam07
{
    public double vector;
    public float momentum;
    public double getPhysic( double dblm, double dbla)
    {
        vector = dblm*dbla;
        return vector;
    }
    public float getPhysic(float fltm1, float fltm2, float fltRe)
    {
        final float G = 9.81f;
        momentum = ((G*(fltm1-fltm2))/(fltRe*fltRe));
        return momentum;
    }
}
