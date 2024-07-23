
import java.util.Scanner;

public class pra7
{
    public static void main(String[] args) {
        System.out.println("23DI013 :- DHARMIK GOHIL \n\n\n");
        System.out.println("Enter One Array Size : - ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a =new int[100];
        int z=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter index "+i);
             a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==9)
            {
                z++;
            }
        }
        if(z==0)
        {
            System.out.println("Not 9 in Array");
        }
        else
        {
            System.out.print(z);
            System.out.println( " time of 9");
        }
    }
}