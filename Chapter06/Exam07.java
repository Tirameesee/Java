import java.util.Arrays;
public class Exam07
{
    public static void main(String[] args) 
    {
       int temp[] = {0,1,2,3,4,5,6,7,8,9};
       Arrays.sort(temp);
       
        System.out.println("Answer is : "+ temp[temp.length - 1]);
    }
}
