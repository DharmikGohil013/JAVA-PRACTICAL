
import java.util.Scanner;
public class pra8
{
    public static void main(String[] args) 
    {
        System.out.println("23DI013 :- DHARMIK GOHIL \n\n\n");
       System.out.print("\nEnter A one String : - ");
       Scanner sc=new Scanner(System.in);
       String string1 = sc.nextLine();
       System.out.print("\nEnter Number of Time Print : - ");
       int n=sc.nextInt();
       for(int i=0;i<string1.length();i++)
       { 
        char y=string1.charAt(i);
        for(int j=0;j<n;j++)
        {
            System.out.print(y);
        }
       }
    }
}