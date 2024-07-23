
import java.util.Scanner;

public class pra6
{
    public static void main(String[] args) 
        {
            System.out.println("23DI013 :- DHARMIK GOHIL \n\n\n");
            Scanner sc = new Scanner(System.in);
            System.out.print("\n Enter Any String : - ");
            String string1 = sc.nextLine() ,string2;
            System.out.print("\n Enter Any N Number To Choose Charcter:-");
            int n = sc.nextInt();
            if(string1.length()>n)
            {
                for(int i=0;i<n;i++)
                {
                    string2=string1.substring(0,n);
                    System.out.print(string2);
                }
            }
            else{
                System.out.println("Your String Charecter Is Low !!");
            }
        }
    
}