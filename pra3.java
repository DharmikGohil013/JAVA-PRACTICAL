
import java.util.Scanner;

class pra3
{
    public static void main(String[] args) {
        System.out.println("23DI013 :- DHARMIK GOHIL \n\n\n");
        System.out.print("Enter You mobile number of this formate (+919624105887): - ");
        Scanner sc = new Scanner(System.in);
        long mobile_number = sc.nextLong(10);
        System.out.println(mobile_number);

        long x=100000000,y,k,b;
        y=mobile_number/x;
        k=mobile_number/100000;
        //System.out.println("Syetem MSc is : - "+k);
        b=mobile_number%100000;
        k=k-(y*1000);
        
        System.out.println("Syetem opreter code is : - "+y);
        System.out.println("Syetem MSc is : - "+k);
        System.out.println("Syetem Unique code is : - "+b);

    }
}