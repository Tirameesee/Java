import java.util.Arrays;
import java.util.Collections;
public class Exam10
{
    public static void main(String[] args) 
    {
       Integer temp[] = {4,2,1,3,0,9,7,5,8};
       Arrays.sort(temp, Collections.reverseOrder());
       
       for (int i : temp){
       
        System.out.print(i + " ");
    }
    }
}
