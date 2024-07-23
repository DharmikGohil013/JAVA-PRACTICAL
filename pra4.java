
//import java.security.cert.PKIXRevocationChecker;
import java.util.Scanner;

class pra4
{
    public static void main(String[] args)
    {
        System.out.println("23DI013 :- DHARMIK GOHIL \n\n\n");
        float motor_prize;
        Scanner sc = new Scanner(System.in);
        int u;
        do{
        System.out.println("\n\n\t\tMAIN M");
        System.out.println("\t\t0.MOTOR");
        System.out.println("\t\t1.FAN");
        System.out.println("\t\t2.LIGHT");
        System.out.println("\t\t3.wires");
        System.out.print("\t\t4.Exit \n Enter Any One : - ");
        u = sc.nextInt();
        String[] a={"motor","fan","Light","wires"};
        int[] b={1000,500,600,800};
        int[] c={8,5,6,18};
        System.out.println("YOUR choice IS "+u);

        switch(u)
        {
            case 1:
            {

                System.out.println("You Enter :- "+a[u]);
                motor_prize=b[u]+((c[u]*b[u])/100);
                System.out.println("Motor Prize is: -"+motor_prize);

                break;  
            }
            case 2:
            {
                System.out.println("You Enter :- "+a[u]);
                motor_prize=b[u]+((c[u]*b[u])/100);
                System.out.print(a[u]);
                System.out.println(" Prize is: -"+motor_prize);
                break;
            }
            case 3:
            {
                System.out.println("You Enter :- "+a[u]);
                motor_prize=b[u]+((c[u]*b[u])/100);
                System.out.print(a[u]);
                System.out.println(" Prize is: -"+motor_prize);
                break;
            }
            case 4:
            {
                System.out.println("You Enter :- "+a[u]);
                motor_prize=b[u]+((c[u]*b[u])/100);
                System.out.print(a[u]);
                System.out.print(" Prize is: -"+motor_prize);
                break;
            }
            case 5:
            {
                System.out.println("thank you");
            }
            default:
            {
                System.out.println("This is Wrrong.....");
            }
        }
        }while(u!=5);

    }
}