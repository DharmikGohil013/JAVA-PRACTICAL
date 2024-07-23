
import java.util.Random;
import java.util.Scanner;

public class pra5
{
    public static void main(String[] args)
    {
        System.out.println("23DI013 :- DHARMIK GOHIL \n\n\n");
        int i=5,z=1;
        System.out.println("\t\t||||||| CHOOSE THE NUMBER GAME |||||||");
        System.out.println("\t\tLet's Start");
        Random random_number = new Random(100);
        int x=random_number.nextInt(100);
        Scanner sc = new Scanner(System.in);
        do
        {
        System.out.print("\n\n\t Enter One Number (ONLY "+i);
        System.out.print(" Attempt (Condition You Have Choose Correct Number) : -");
        
        int number= sc.nextInt();
        //int d = x-number;
        if(x==number)
        {
            System.out.println("WOW! YOU CHOOSE CORRECT NUMBER ..... ");
            z++;
            break;
        }
        else if( (x+10)>number && (x-10)<number)
        {
            System.out.println("Your Number Is close");
        }
        else{
            System.out.println("Your Number Is High");
           
            
        }
        i--;
        }
        while(i>0);
        if(z==1)
        {
            System.out.println("\n\n\t\t\t TRY AGAIN !!!!... ");
        }
        

    }
}