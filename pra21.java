
import java.util.Scanner;

class pra21
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter N Number : - ");
        int n=sc.nextInt();
        MyCalculator obj = new MyCalculator();
        int result = obj.divisor_sum(n);
        System.out.println("Result is : - "+result);
    }
}
interface  MyCalculator1
{
    public int divisor_sum(int n);
}
class MyCalculator implements  MyCalculator1
{
    public int divisor_sum(int n)
    {
        int sum = 0 ;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return  sum;
        
    }
}
