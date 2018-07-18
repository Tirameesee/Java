
public class Exam02
{
    public double tax;
    public int salary;
    public int salaryset(int intsalary)
    {
        salary = intsalary;
        return salary;
    }
    public double caltax()
    {
        if (salary >= 4000000) {
                double tax = 0.37;
                double sum = (salary*tax);
                System.out.print("Your tax is : " + sum);
            } else if (salary >= 1000000) {
                double tax = 0.3;
                double sum = (salary*tax);
                System.out.print("Your tax is : " + sum);
            } else if (salary >= 400000) {
                double tax = 0.2;
                double sum = (salary*tax);
                System.out.print("Your tax is : " + sum);
            } else if (salary >= 100000) {
                double tax = 0.1;
                double sum = (salary*tax);
                System.out.print("Your tax is : " + sum);
            } else {
                double tax = 0.05;
                double sum = (salary*tax);
                System.out.print("Your tax is : " + sum);
            }
        return tax;
    }
    
}
