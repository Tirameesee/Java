
public class Exam03
{
    public String charset;
    public int countchar;
    public Exam03()
    {
        countchar = 0;
    }
    public String calch(String words)
    {
        charset = words;
        return charset;
    }
    public int Calchar()
    {
        countchar = charset.length();
        System.out.println(countchar);
        return countchar;
    }
}
