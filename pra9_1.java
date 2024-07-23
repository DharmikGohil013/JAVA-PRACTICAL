
import java.util.Scanner;


class pra9
{
    static void length1(String string1) 
    {
        int s = string1.length();
        System.out.println(" Length of String is : - "+s);
    }
    static void lower(String string1)
    {
        System.out.println(string1.toLowerCase());
    }
    static void uper(String string1)
    {
        System.out.println(string1.toUpperCase());
    }
    static void rev(String string1)
    {
        for(int i=string1.length();i>0;i--)
        {
            char ch = string1.charAt(i);
            System.out.println("REV is : - "+ch);
        } 
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the String : - ");
        Scanner sc = new Scanner(System.in);
        String string1=sc.nextLine();
        System.out.println(":::::::MAIN MANU:::::::::");
        System.out.println("1.Length Of string : - ");    
        System.out.println("2.Lower Case Of String : - ");    
        System.out.println("3.Upercase of String : - ");    
        System.out.println("4.revers the string : - ");
        System.out.println("5.sort the string : - "); 
        System.out.print("\n\nEnter any one: - ");  
        int  option = sc.nextInt() ;
        switch(option)
        {
            
            case 1:
            {
                length1(string1);
                break;
            }
            case 2:
            {
                lower(string1);
                break;
            }
            case 3:
            {
                uper(string1);
                break;
            }
            case 4:
            {
                rev(string1);
                break;
            }
            case 5:
            {
                break;
            }

        }
    }
}