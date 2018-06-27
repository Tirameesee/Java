
public class Exam11
{
    public static void main(String[] args) {
        int n = 9;
        int upperCount = 1;
        for(int i=n; i>=1; i--){

            for(int j=i; j>=1; j--){
       System.out.print(" ");
      }
      System.out.print(upperCount);

      for(int j=0; j<=upperCount-2; j++){
       System.out.print(" ");
      }

      for(int j=0; j<=upperCount-2; j++){
       System.out.print(" ");
      }

      if(upperCount!=1){
       System.out.print(upperCount);
      }

      upperCount++;
      System.out.print("\n");
    }

  }
}