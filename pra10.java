
import java.util.Scanner;

class pra10
{
    public static void main(String[] args) {
        System.out.println("23DI013 :- DHARMIK GOHIL \n\n\n");
        System.out.print("\nEnter A string : - ");
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();
        System.out.println("Enter A One Char : - ");
        char a=sc.next().charAt(100);
        for(int i=0;i<string1.length();i++)
        {
            char f=string1.charAt(i);
            if(f==a)
            {
                System.out.println("Reples Your name first Later : - ");
                char x=sc.next().charAt(1);
                System.out.print(x);
            }
            else{
                System.out.print(f);
            }
           
        }
    }
}