
import java.util.Scanner;
class pra2
{
    public static void main(String[] args)
    {
        System.out.println("23DI013 :- DHARMIK GOHIL \n\n\n");
        char[] a={'a','b','c','d','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String[] b={"----","....","-.-.",".-.-","--..","..--","////",";;;;","&&&&"};
        System.out.print("Enter Your Charcter /s : - ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for(int i=0;i<line.length();i++)
        {
            char s=line.charAt(i);
            if(s==a[i])
            {
                System.out.print(b[i]);
            }
        }
        System.out.println("Enter Your Mors /s : - ");
        String morse = sc.nextLine();
        //char g;
        for(int j=0;j<morse.length()/4;j++)
        {
            if(morse.equals(b[j]))
            {
                System.out.print(a[j]);
            }
        }
    }
}