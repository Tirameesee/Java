
public class Exam10
{
    public double vectorsound;
    public float vectorspeed;
    public int finalvector;
    public double getPhysic( double dblt)
    {
        vectorsound = (331+(0.6*dblt));
        return vectorsound;
    }
    public float getPhysic(float flts1, float flts2, float fltt1, float fltt2)
    {
        vectorspeed = ((flts2-flts1)/(fltt2-fltt1));
        return vectorspeed;
    }
    public int getPhysic(int intu, int inta, int intt)
    {
        finalvector = (intu+(inta*intt));
        return finalvector;
    }
}
